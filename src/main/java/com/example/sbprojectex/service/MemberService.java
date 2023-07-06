package com.example.sbprojectex.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import com.example.sbprojectex.dto.CreationMemDto;
import com.example.sbprojectex.dto.InfoMemDto;
import com.example.sbprojectex.dto.MemberDto;
import com.example.sbprojectex.dto.MemberSrcDto;
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

    public List<InfoMemDto> getTotMember(){
        //memberRepository.findBy
        return null;
    }

    public MemberDto getMemberInfo(MemberSrcDto searchDto){

        Member resultMember = null;
        InfoMemDto loadMemDto = null;

        String sEmail = searchDto.getSEmail();

        if(!StringUtils.isEmpty(sEmail)){
            
            resultMember = memberRepository.findByEmail(sEmail);
        }
        
        if(resultMember != null){
            loadMemDto = InfoMemDto.builder()   .email(resultMember.getEmail())
                                                .age(resultMember.getAge())
                                                .id(resultMember.getId())
                                                .password(resultMember.getPassword())
                                                .build();
        }

        return loadMemDto;
    }
    
}
