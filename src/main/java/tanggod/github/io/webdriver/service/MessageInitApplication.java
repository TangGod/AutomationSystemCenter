package tanggod.github.io.webdriver.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tanggod.github.io.webdriver.dto.MessageDto;

public class MessageInitApplication {

    private static final String sleepCodeFlag = "$sleep:";//"$sleep:(2000)";
    private static final String sleepCode = "function sleepx(n) { " +
            "var start = new Date().getTime();    console.log('休眠前：' + start); " +
            "while (true) {   " +
            "if (new Date().getTime() - start > n) { " +
            " break;  } }         console.log('休眠后：' + new Date().getTime());    }";

    public static void run(String telephone) throws Exception{
        MessageService messageService = new MessageService();
        WebDriver chrome = MessageService.chrome;
        //爱奇艺
        MessageDto messageDto = new MessageDto();
        messageDto.setTelephone(telephone);
        messageDto.setMessageWebSiteUrl("https://www.iqiyi.com");
        messageDto.setRunnableMEthod(()->{
            chrome.findElement(By.id("nav_LR")).findElements(By.tagName("a")).get(1).click();
            //等待
           /* WebDriverWait wait_1 = new WebDriverWait(chrome, 10);
            wait_1.until(ExpectedConditions.presenceOfElementLocated(By.className("proto-check-icon")));*/
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chrome.findElements(By.className("txt-account")).get(1).sendKeys(messageDto.getTelephone());
            chrome.findElement(By.className("proto-check-icon")).click();
            chrome.findElements(By.className("btn-gray")).get(1).click();
        });
        //messageDto.setSendMessageJSCode("${jquery} var nav_LR=document.getElementById('nav_LR');nav_LR.getElementsByTagName('a')[1].click();$sleep:(3000);document.getElementsByClassName('txt-account')[1].value=${telephone};$('.proto-check-icon').click();document.getElementsByClassName('btn-gray')[1].click();");
        //sleep(messageDto);
        messageService.add(messageDto);

    }

    private static void sleep(MessageDto messageDto ) {
        String sendMessageJSCode = sleepCode + messageDto.getSendMessageJSCode();
        if (sendMessageJSCode.contains(sleepCodeFlag)) {
            sendMessageJSCode= sendMessageJSCode.replace(sleepCodeFlag, "sleepx");
            messageDto.setSendMessageJSCode(sendMessageJSCode);
        }
    }
}
