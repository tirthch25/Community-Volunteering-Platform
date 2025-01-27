package com.Volunteering_platform.Communityplatform.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
        // This will render the home.html template
    }
    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

    @GetMapping("/index")
    public  String index()
    {
        return "index";
    }
    @GetMapping("/signup")
    public  String signup()
    {
        return "signup";
    }
    @GetMapping("/get-involved")
    public  String getinvolved()
    {
        return "get-involved";
    }
    @GetMapping("/search")
    public String search(Model model) {
        // Add logic here if needed (e.g., pass search data to the view)
        return "search"; // Render the search.html page
    }
    @GetMapping("/rating")
    public String rating()
    {
        return "rating";
    }
    @GetMapping("/home")
    public String shome()
    {
        return "home";
    }
    @GetMapping("/DeleteAcc")
    public  String DeleteAcc()
    {
        return "DeleteAcc";
    }
    @GetMapping("/UpdateProfile")
    public String UpdateProfile ()
    {
        return "UpdateProfile" ;
    }
    @GetMapping("/ViewOrg")
    public String ViewOrg()
    {
        return "ViewOrg";
    }
    @GetMapping("/ViewVolun")
    public String ViewVolun()
    {
        return "ViewVolun";
    }
}
