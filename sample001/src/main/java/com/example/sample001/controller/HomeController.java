package com.example.sample001.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // ルートパスにアクセスがあった場合に home.html を表示
    @GetMapping("/")
    public String home() {
        return "home";  
    }
}
