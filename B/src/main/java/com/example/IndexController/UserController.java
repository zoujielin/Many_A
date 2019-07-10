package com.example.IndexController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class UserController {
    @GetMapping
    public String s(){
        return "Hello World!!";
    }
}
