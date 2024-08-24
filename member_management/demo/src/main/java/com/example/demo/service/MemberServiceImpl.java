package com.example.demo.service;

import com.example.demo.dao.MemberDao;
import com.example.demo.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MemberServiceImpl implements MemberService{
    MemberDao memberDao;
    @Autowired
    public MemberServiceImpl(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public Member getMember(int id) {
        return memberDao.getMember(id);
    }

    @Override
    public void addMember(Member newMember) {
        memberDao.addMember(newMember);
    }

    @Override
    public void deleteMember(int id) {
        memberDao.deleteMember(id);
    }

    @Override
    public void changeMemberInformation(int id) {

    }
}
