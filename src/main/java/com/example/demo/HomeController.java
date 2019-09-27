package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/coreJava")
    public String coreJava(){
        return "CoreJava";
    }
    @RequestMapping("/html")
    public String html(){
        return "html";
    }

    @RequestMapping("/bootStrap")
    public String bootStrap(){
        return "bootStrap";
    }
    @RequestMapping("/OOP")
    public String OOP(){
        return "OOP";
    }
    @RequestMapping("/gitHub")
    public String gitHub (){
        return "gitHub";
    }
    @RequestMapping("/bootcamp")
    public String bootcamp (){
        return "bootcamp";
    }
    @RequestMapping("/author")
    public String author (){
        return "author";
    }

    @RequestMapping("/blogs")
    public String blogs (){
        return "blogs";
    }
}

