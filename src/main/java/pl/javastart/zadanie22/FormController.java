package pl.javastart.zadanie22;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    private static final String OWNER_EMAIL = "matman@byom.de";
    private final MailService mailService;

    public FormController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/kontakt")
    public String contact(Model model) {
        model.addAttribute("message", new Message());
        return "contact";
    }

    @PostMapping("/send")
    public String mail(Message message) {
        mailService.mailSend(OWNER_EMAIL, message);
        return "redirect:/success.html";
    }
}
