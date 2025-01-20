package com.Volunteering_platform.Communityplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
        // This will render the home.html template
    }
    @GetMapping("/jobs")
    public String login()
    {
        return "login";
    }


}
