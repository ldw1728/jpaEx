package com.example.sbprojectex.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.sbprojectex.entity.Member;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom{@Override
    public List<Member> findAllByMember(Member member) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findAllByMember'");
    }
    
}
