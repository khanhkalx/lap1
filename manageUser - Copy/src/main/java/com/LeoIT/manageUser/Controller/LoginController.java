package com.LeoIT.manageUser.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {
    @GetMapping
    public  String ShowHomePage(){
        return "index";
    }
    @GetMapping("login")
    public  String ShowLogin(){
        return "login";
    }
    @GetMapping("register")
    public  String ShowRegisterForm(){
        return "register";
    }

}
