package com.example.sbprojectex.dto;

import javax.validation.constraints.Email;

import lombok.Data;

@Data
public class MemberSrcDto extends SearchDto{
    /* Member */
    @Email
    private String sEmail;

    private String sName;
}
