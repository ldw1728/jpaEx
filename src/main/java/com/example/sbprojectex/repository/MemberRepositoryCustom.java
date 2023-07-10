package com.example.sbprojectex.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.sbprojectex.dto.InfoMemDto;
import com.example.sbprojectex.dto.MemberSrcDto;
import com.example.sbprojectex.entity.Member;

public interface MemberRepositoryCustom {
    public Page<InfoMemDto> findAllByMember(MemberSrcDto memberSrcDto, Pageable pageable);
    public Member findByMember(MemberSrcDto memberSrcDto);
}
