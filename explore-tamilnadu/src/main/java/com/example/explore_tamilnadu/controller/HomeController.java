package com.example.explore_tamilnadu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/destinations")
    public String destinations() {
        return "destinations";
    }

    @GetMapping("/hotels")
    public String hotels() {
        return "hotels";
    }

    @GetMapping("/guides")
    public String guides() {
        return "guides";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}