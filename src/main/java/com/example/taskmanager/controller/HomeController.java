package com.example.taskmanager.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String index() {
        return "index"; // Bu, "index.html" dosyasını döndürecektir (eğer uygun dizinde ise)
    }
}