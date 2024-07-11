package com.example.Firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/random-quote")
    public String sendQuote(Model model) {
        model.addAttribute("randomQuote", "오늘이 너의 날이 아니면 내일은 너의 날일거다");
        return "randomQuote";
    }
}
