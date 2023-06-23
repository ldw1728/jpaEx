package com.example.sbprojectex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.sbprojectex.entity.Member;
import com.example.sbprojectex.repository.MemberRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest // 전체빈들을 등록하고 springboot의 설정들을 적용한 환경에서 테스트
class MemberServiceTest{
    
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void saveMember(){
        Member member = Member.builder().name("leedongwook").age(30).build();
        memberRepository.save(member);

        Member retrivedMember = memberRepository.findById(member.getId()).get();

        System.out.println(retrivedMember.toString());        
    }

}