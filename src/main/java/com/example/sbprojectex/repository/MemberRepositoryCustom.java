package com.example.sbprojectex.repository;

import java.util.List;

import com.example.sbprojectex.entity.Member;

public interface MemberRepositoryCustom {
    public List<Member> findAllByMember(Member member);
}
