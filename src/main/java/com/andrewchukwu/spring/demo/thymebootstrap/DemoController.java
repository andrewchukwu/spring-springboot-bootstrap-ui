package com.andrewchukwu.spring.demo.thymebootstrap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/index")
    public String sayHello(Model theModel){
        theModel.addAttribute("title","Simple steps to import bootstrap in Springboot Application!");

        //this is the template to return (template/helloworld.html)
        return "index";
    }
}
