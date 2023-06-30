package com.example.sbprojectex.dto;

import javax.validation.constraints.Email;

import lombok.Data;

@Data
public class SearchDto {

    /* Member */
    @Email
    private String sEmail;

    private String sName;
}
