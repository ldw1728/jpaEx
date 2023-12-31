package com.example.sbprojectex.entity;

import java.io.Serializable;

import javax.crypto.SecretKeyFactory;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.example.sbprojectex.dto.InfoMemDto;
import com.example.sbprojectex.dto.MemberDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "MEMBER")
@NoArgsConstructor
public class Member {
    
    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // private long id;

    @Id
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private int age;

    @Builder
    public Member(String email, String password, String name, int age){
        this.email = email;
        this.password = password;
        this.name = name;
        this.age = age;
        
    }

    @Override
    public String toString(){
        return this.name + ", " + this.age;
    }


}
