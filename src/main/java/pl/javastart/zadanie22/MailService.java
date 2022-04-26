package pl.javastart.zadanie22;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private static final Logger logger = LoggerFactory.getLogger(MailService.class);

    private final JavaMailSender javaMailSender;

    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void mailSend(String reciever, Message message) {
        logger.debug("Wysyłam maila {}", reciever);
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(message.getEmail());
        simpleMailMessage.setTo(reciever);
        simpleMailMessage.setSubject(message.getName());
        simpleMailMessage.setText(message.getText());
        javaMailSender.send(simpleMailMessage);
        logger.debug("Mail do {} wysłany", reciever);
    }
}
