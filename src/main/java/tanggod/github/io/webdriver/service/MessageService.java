package tanggod.github.io.webdriver.service;

import cn.xchats.onlinetraffic.common.other.webdriver.PhantomJsUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Service;
import tanggod.github.io.webdriver.dto.MessageDto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//@Service
public class MessageService {

    private static PhantomJsUtil phantomJsUtil = new PhantomJsUtil();
    public static final WebDriver chrome = phantomJsUtil.getChromeDriver();


    private static final int DEFAULT_QUEUE_SIZE = 1024;

    private static final BlockingQueue<MessageDto> messageQueue = new ArrayBlockingQueue(DEFAULT_QUEUE_SIZE);//要执行的消息队列

    public static final List<MessageDto> messageWebSiteList = new ArrayList<>(20);

    private static final String serializationPath = "/Users/tanggod/cache/messageWebSiteList";

    public MessageService() throws Exception {
        task().start();
    }

    //执行一条短信发送
    public Thread task() throws Exception {
        return new Thread(() -> {
            while (true) {
                MessageDto message = poll();
                if (Objects.nonNull(message)) {
                    //todo 执行发送
                    chrome.get(message.getMessageWebSiteUrl());
                    Runnable runnableMEthod = message.getRunnableMEthod();
                    runnableMEthod.run();

               /* if (message.getSendMessageJSCode().contains("${jquery}")) {
                    message.setSendMessageJSCode(message.getSendMessageJSCode().replace("${jquery}", ""));
                    phantomJsUtil.getJquery(chrome);
                }*/

                /*JavascriptExecutor chromeJs = (JavascriptExecutor) chrome;
                message.setSendMessageJSCode(message.getSendMessageJSCode().replace("${telephone}", message.getTelephone()));
                chromeJs.executeScript(message.getSendMessageJSCode());*/
                }

            }
        });
    }

    public MessageDto poll() {
        return messageQueue.poll();
    }

    public void add(MessageDto message) {
        messageQueue.offer(message);
    }

    public void serializationWrite() throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(serializationPath)));
        out.writeObject(messageWebSiteList);
        out.flush();
    }

    public void serializationRead() throws Exception {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(new File(serializationPath)));
        messageWebSiteList.clear();
        messageWebSiteList.addAll((ArrayList) input.readObject());
        System.out.println(messageWebSiteList.size());
    }

    public void addTask(String telephone) {
        for (int i = 0; i < messageWebSiteList.size(); i++) {
            MessageDto messageDto = messageWebSiteList.get(i);
            messageDto.setTelephone(telephone);
            add(messageDto);
        }
    }

    public static void main(String[] args) throws Exception {

        MessageService messageService = new MessageService();
        MessageInitApplication.run("18110225751");

        //messageService.serializationWrite();
        //messageService.serializationRead();
    }
}
