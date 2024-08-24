package com.example.demo.service;

import com.example.demo.model.Member;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    public Member getMember(int id);
    public void addMember(Member newMember);
    public void deleteMember(int id);
    public void changeMemberInformation(int id);
}
