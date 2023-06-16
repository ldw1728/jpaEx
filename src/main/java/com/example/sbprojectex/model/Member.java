package com.example.sbprojectex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "MEMBER")
@NoArgsConstructor
public class Member {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private int age;

    @Builder
    public Member(String name, int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString(){
        return this.name + ", " + this.age;
    }
}
