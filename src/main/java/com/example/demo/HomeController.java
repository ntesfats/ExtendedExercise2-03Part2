package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/contactform")
    public String loadContactForm(Model model) {
        model.addAttribute("contact", new Person());
        return "contactForm";

    }

    @PostMapping("/contactform")
    public String confirmContactForm(@ModelAttribute Person person, Model model) {

        model.addAttribute("contact", person);
        return "confirmContactForm";
    }

}
