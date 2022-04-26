package pl.javastart.zadanie22;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private MailService mailService;

    public MainController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/kontakt")
    public String contact(Model model) {
        model.addAttribute("message", new Message());
        return "contact";
    }

    @PostMapping("/send")
    public String mail(Message message) {
        mailService.mailSend("matman@byom.de", message);
        return "redirect:/";
    }

}
