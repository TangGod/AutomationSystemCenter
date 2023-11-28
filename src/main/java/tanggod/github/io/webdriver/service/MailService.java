package tanggod.github.io.webdriver.service;

import cn.xchats.onlinetraffic.common.type.EmailParameterType;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.util.Map;

/*
 *
 *@author teddy
 *@date 2018/5/16
 */
@Service
public class MailService {

    @Autowired
    private JavaMailSender jms;

    @Autowired
    JavaMailSenderImpl senderImpl;

    //建立邮件消息
    private SimpleMailMessage mainMessage = new SimpleMailMessage();

    public MailService() {
        //发送者
        //mainMessage.setFrom("Hang_Zhou_Jiu_Ding@163.com");
        mainMessage.setFrom("1084986263@qq.com");
        //发送的标题
        //mainMessage.setSubject("wish:采集任务完成通知");
    }



    @RabbitListener(queues = "wishList")
    public void sendHtmlMail2(Map<Object, Object> param) {
        MimeMessage message = null;
        String targetEmail, content;
        targetEmail = String.valueOf(param.get(EmailParameterType.TARGET_EMAIL));
        content = String.valueOf(param.get(EmailParameterType.CONTENT));
        String title = String.valueOf(param.get("title"));
        try {
            message = jms.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(targetEmail);

            //发送者
            helper.setFrom("Hang_Zhou_Jiu_Ding@163.com");
            //发送的标题
            helper.setSubject("wish:" + title + "任务通知");


            //helper.setText(content, true);
            helper.setText(content,true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        jms.send(message);
    }


}
