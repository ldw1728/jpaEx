package com.example.sbprojectex.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

        resultMember = memberRepository.findByMember(searchDto);

        if(resultMember != null){
            loadMemDto = InfoMemDto.builder()   .email(resultMember.getEmail())
                                                .age(resultMember.getAge())
                                                .name(resultMember.getName())
                                                .password(resultMember.getPassword())
                                                .build();
        }

        return loadMemDto;
    }
    

    public Page<InfoMemDto> getMembers(MemberSrcDto searchDto, Pageable pageable){

        //List<InfoMemDto> memberDtos = new ArrayList<InfoMemDto>();
        
        Page<InfoMemDto> members = memberRepository.findAllByMember(searchDto, pageable);

        // if(!members.isEmpty()){
        //     for(Member mem : members.getContent()){
        //         InfoMemDto infoMemTmp = InfoMemDto.builder().email(mem.getEmail())
        //                                                     .age(mem.getAge())
        //                                                     .name(mem.getName())
        //                                                     .password(mem.getPassword())
        //                                                     .build();

        //         memberDtos.add(infoMemTmp);                                                            
        //     }
        // }

        return members;
    }
}
