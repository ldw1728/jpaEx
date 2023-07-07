package com.example.sbprojectex.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sbprojectex.dto.CreationMemDto;
import com.example.sbprojectex.dto.InfoMemDto;
import com.example.sbprojectex.dto.MemberDto;
import com.example.sbprojectex.dto.MemberSrcDto;
import com.example.sbprojectex.dto.SearchDto;
import com.example.sbprojectex.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
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

    @GetMapping("/info")
    public InfoMemDto infoMember(@ModelAttribute @Valid MemberSrcDto searchDto){
        InfoMemDto loadMemDto = (InfoMemDto) memberService.getMemberInfo(searchDto);
        if(loadMemDto != null)
            return loadMemDto;
        else 
            return null;
    }

    @GetMapping("/list")
    public List<InfoMemDto> memList(Model model, Pageable pageable, @ModelAttribute @Valid MemberSrcDto searchDto){
        
        List<InfoMemDto> dtos = memberService.getMembers(searchDto);

        return dtos;
    }

}
