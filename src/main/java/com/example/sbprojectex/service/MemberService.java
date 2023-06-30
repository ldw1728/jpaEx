package com.example.sbprojectex.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import com.example.sbprojectex.dto.CreationMemDto;
import com.example.sbprojectex.dto.LoadMemDto;
import com.example.sbprojectex.dto.MemberDto;
import com.example.sbprojectex.dto.SearchDto;
import com.example.sbprojectex.entity.Member;
import com.example.sbprojectex.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public void addMember(CreationMemDto memDto){
        memberRepository.save(memDto.toMemeberEntity());
    }

    public MemberDto getMemberInfo(SearchDto searchDto){

        Member resultMember = null;
        LoadMemDto loadMemDto = null;

        String sEmail = searchDto.getSEmail();

        if(!StringUtils.isEmpty(sEmail)){
            resultMember = memberRepository.findByEmail(sEmail);
        }
        
        if(resultMember != null){
            loadMemDto = LoadMemDto.builder()   .email(resultMember.getEmail())
                                                .age(resultMember.getAge())
                                                .id(resultMember.getId())
                                                .password(resultMember.getPassword())
                                                .build();
        }

        return loadMemDto;
    }
    
}
