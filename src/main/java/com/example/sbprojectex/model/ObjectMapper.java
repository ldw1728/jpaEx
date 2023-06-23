package com.example.sbprojectex.model;

import org.springframework.stereotype.Component;

import com.example.sbprojectex.dto.CreationMemDto;
import com.example.sbprojectex.entity.Member;

@Component
public class ObjectMapper {
    
    public Member toMemberEntity(CreationMemDto memDto){
        return Member.builder()
                        .email(memDto.getEmail())
                        .name(memDto.getName())
                        .age(memDto.getAge())
                        .password(memDto.getPassword())
                        .build();
    }
}
