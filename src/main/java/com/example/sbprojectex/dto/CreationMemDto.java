package com.example.sbprojectex.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.example.sbprojectex.entity.Member;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CreationMemDto extends MemberDto{
    @NotBlank
    @Size(min = 8, max = 20)
    String password;

    @Override
    public Member toMemeberEntity() {
        return Member.builder()
                        .email(this.getEmail())
                        .name(this.getName())
                        .age(this.getAge())
                        .password(this.getPassword())
                        .build();
    }

   
}
