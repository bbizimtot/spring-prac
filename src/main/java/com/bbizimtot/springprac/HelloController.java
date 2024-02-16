package com.bbizimtot.springprac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")    
    public String index() {
        System.out.println("Test");
        return "Hello, Spring Boot!!! 1234";
    }
}
