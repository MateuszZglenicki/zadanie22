package pl.javastart.zadanie22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Zadanie22Application {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context =
        SpringApplication.run(Zadanie22Application.class, args);
//        Message message1 = new Message("Tomek", "eeb9e42420f404", "Test1");
//        MailService mailService = context.getBean(MailService.class);
//        mailService.mailSend("matman@byom.de", message1);
    }

}
