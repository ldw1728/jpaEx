package com.example.sbprojectex.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.sbprojectex.dto.CreationMemDto;
import com.example.sbprojectex.dto.MemberDto;
import com.example.sbprojectex.entity.Member;
import com.example.sbprojectex.model.ObjectMapper;
import com.example.sbprojectex.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    private final ObjectMapper mapper;

    @Transactional
    public void addMember(CreationMemDto memDto){
        Member member = mapper.toMemberEntity(memDto);
        memberRepository.save(member);
    }

    // public MemberDto getMemberInfo(){

    // }
    
}
