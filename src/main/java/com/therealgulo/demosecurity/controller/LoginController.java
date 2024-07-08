package com.therealgulo.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    //our custom login page... instead of the default one provided by spring security.
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
        //return "plain-login";
        return "fancy-login";
    }

    //add request mapping for access-denied.
    @GetMapping("/accessDenied")
    public String showAccessDenied(){
        return "access-denied";
    }
}
