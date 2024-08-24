package com.example.demo.dao;

import com.example.demo.model.Member;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao{
    EntityManager entityManager;

    @Autowired
    public MemberDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Member getMember(int id) {
        return entityManager.createQuery("SELECT a from Member a where a.id = :id", Member.class).setParameter("id", id).getSingleResult();
    }

    @Override
    @Transactional
    public void deleteMember(int id) {
        Member member = entityManager.createQuery("SELECT a FROM Member a where a.id = :id", Member.class).getSingleResult();
        entityManager.remove(member);
    }

    @Override
    @Transactional
    public void addMember(Member newMember) {
        entityManager.persist(newMember);
    }
}
