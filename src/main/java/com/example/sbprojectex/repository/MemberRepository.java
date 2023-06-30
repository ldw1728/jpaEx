package com.example.sbprojectex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sbprojectex.entity.Member;


public interface MemberRepository extends JpaRepository<Member, Long>{
    public Member findByEmail(String email);
}
