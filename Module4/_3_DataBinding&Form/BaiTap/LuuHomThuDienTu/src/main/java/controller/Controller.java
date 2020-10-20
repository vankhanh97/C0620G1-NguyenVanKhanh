package controller;


import model.MailSetting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    public static MailSetting mailSetting = new MailSetting("English", "5", "checked", "Thor King ,Asgard");

        @GetMapping("/")
        public String goHome() {
        return "home";
    }

    @GetMapping("/home")
    public String updated(@RequestParam String language, @RequestParam String page_size, @RequestParam String spam, @RequestParam String signature, Model model) {
        mailSetting.setLanguage(language);
        mailSetting.setPageSize(page_size);
        mailSetting.setSpam(spam);
        mailSetting.setSignature(signature);
        model.addAttribute("mailSetting", mailSetting);

        return "home";
    }


}
