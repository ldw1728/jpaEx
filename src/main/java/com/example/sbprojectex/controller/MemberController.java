package com.example.sbprojectex.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sbprojectex.dto.CreationMemDto;
import com.example.sbprojectex.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/member")
public class MemberController {


    // constructor DI
    private final MemberService memberService;
    
    @PostMapping(value = "/join")
    @ResponseBody
    public String joinMember(@RequestBody @Valid CreationMemDto cmDto){
        memberService.addMember(cmDto);
        return "joinSucc";
    }
}
