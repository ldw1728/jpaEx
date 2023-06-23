package com.example.sbprojectex.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CreationMemDto extends MemberDto{
    @NotBlank
    @Size(min = 8, max = 20)
    String password;
}
