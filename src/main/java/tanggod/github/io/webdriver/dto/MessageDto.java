package tanggod.github.io.webdriver.dto;

import org.openqa.selenium.WebDriver;

import java.io.Serializable;

//@Data
public class MessageDto implements Serializable {



    private String messageWebSiteUrl;//可以发短信的网站页面链接
    private String sendMessageJSCode;//要执行的js代码
    private String telephone;//本条轰炸的手机号

    Runnable runnableMEthod;//执行对方法


    public String getMessageWebSiteUrl() {
        return messageWebSiteUrl;
    }

    public void setMessageWebSiteUrl(String messageWebSiteUrl) {
        this.messageWebSiteUrl = messageWebSiteUrl;
    }

    public String getSendMessageJSCode() {
        return sendMessageJSCode;
    }

    public void setSendMessageJSCode(String sendMessageJSCode) {
        this.sendMessageJSCode = sendMessageJSCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Runnable getRunnableMEthod() {
        return runnableMEthod;
    }

    public void setRunnableMEthod(Runnable runnableMEthod) {
        this.runnableMEthod = runnableMEthod;
    }
}
