package com.example.sbprojectex.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.example.sbprojectex.entity.Member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class MemberDto {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String name;

    @Positive
    @NotNull
    private int age;

    public abstract Member toMemeberEntity();

}
