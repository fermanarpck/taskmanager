package com.example.taskmanager.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SuppressWarnings("ALL")
@Controller
// MyErrorController.java
public class MyErrorController implements ErrorController {


    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public String handleError() {
        // Error handling logic
        return "error-page"; // Replace with your error page name
    }
}

