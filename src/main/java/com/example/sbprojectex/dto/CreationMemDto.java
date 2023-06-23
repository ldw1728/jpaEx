package com.example.sbprojectex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CreationMemDto extends MemberDto{
    String password;
}
