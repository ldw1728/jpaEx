package com.example.sbprojectex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sbprojectex.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{
    
}
