package com.example.sbprojectex.dto;

import org.springframework.lang.Nullable;

import com.example.sbprojectex.entity.Member;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InfoMemDto extends MemberDto{

    @Nullable
    private String password;
    
    @Builder
    public InfoMemDto(long id, String email, String name, int age, String password){
        super(id, email, name, age);
        this.password = password;
    }

    @Override
    public Member toMemeberEntity() {
        return null;
        
    }

}