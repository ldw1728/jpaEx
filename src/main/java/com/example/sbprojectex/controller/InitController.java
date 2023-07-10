package com.example.sbprojectex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
public class InitController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}
