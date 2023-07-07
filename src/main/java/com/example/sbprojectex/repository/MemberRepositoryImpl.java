package com.example.sbprojectex.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.sbprojectex.dto.MemberSrcDto;
import com.example.sbprojectex.entity.Member;
import com.example.sbprojectex.entity.QMember;
import com.querydsl.core.NonUniqueResultException;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.util.StringUtils;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom{

    private final JPAQueryFactory jpaQueryFactory;

     private QMember qMember = QMember.member;

    
    @Override
    public List<Member> findAllByMember(MemberSrcDto memberSrcDto) {
        
        List<Member> members = jpaQueryFactory
                                            .select(qMember)
                                            .from(qMember)
                                            .where(
                                                nameEq(memberSrcDto.getSName()), 
                                                emailEq(memberSrcDto.getSEmail())
                                                )
                                            .fetch();
       return members;
    }

    @Override
    public Member findByMember(MemberSrcDto memberSrcDto) {


        Member member = null;

        try{

            member = jpaQueryFactory
                                .select(qMember)
                                .from(qMember)
                                .where(emailEq(memberSrcDto.getSEmail()))
                                .fetchOne();

        }catch(NonUniqueResultException n){ // 결과가 둘 이상 조회 시
            log.error(n.getMessage(), n);
        }

        
        return member;
                                
    }


    private BooleanExpression nameEq(String name){
        return hasText(name) ? qMember.name.eq(name) : null;
    }

    private BooleanExpression emailEq(String email){
        return hasText(email) ? qMember.email.eq(email) : null;
    }

    private boolean hasText(String str){
        return !StringUtils.isNullOrEmpty(str);
    }
    
}
