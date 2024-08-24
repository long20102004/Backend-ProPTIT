package com.example.demo.dao;

import com.example.demo.model.Member;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public interface MemberDao {
    public Member getMember(int id);
    public void deleteMember(int id);
    public void addMember(Member newMember);
}
