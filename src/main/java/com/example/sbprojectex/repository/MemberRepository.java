package com.example.sbprojectex.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sbprojectex.entity.Member;


public interface MemberRepository extends JpaRepository<Member, Long>{
    // 특정 email property 값으로 member를 조회
    public Member findByEmail(String email);
    // find 할 때 검색조건이 여러개 혹은 혹잡한 쿼리를 요구 할경우 queryDSL사용 권장 (jpa specification은 권장 x)
    //public List<Member> findAllByEntity(Member member);
    public List<Member> findAll();
    //public Slice<Member> findBySlice(Member member, Pageable pageable);
}
