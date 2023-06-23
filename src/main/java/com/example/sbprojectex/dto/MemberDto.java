package com.example.sbprojectex.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.Data;

@Data
public class MemberDto {

    private long id;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String name;

    @Positive
    @NotNull
    private int age;

}
