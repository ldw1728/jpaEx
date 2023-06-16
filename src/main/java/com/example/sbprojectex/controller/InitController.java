package com.example.sbprojectex.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class InitController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index.html";
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String requestData(HttpServletRequest request, Model model) throws IOException{
        model.addAttribute("data", "wooklee");
        return "data.html";
    }

    @ResponseBody
    @RequestMapping(value = "/resdata", method = RequestMethod.POST)
    public String resData(HttpServletRequest request, Model model,  int[] ldw, @RequestBody String name) throws IOException{
        model.addAttribute("data", "wooklee");

        //log.info(Arrays.toString(ldw));
        return "111";
    }

}
