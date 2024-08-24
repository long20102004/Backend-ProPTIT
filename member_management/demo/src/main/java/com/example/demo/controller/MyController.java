package com.example.demo.controller;

import com.example.demo.model.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyController {
    MemberService memberService;
    @Autowired
    public MyController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/member/{memberId}")
    public Member getMember(@PathVariable int memberId) {
        Member member = memberService.getMember(memberId);
        System.out.println(member.getName());
        return member;
    }
    @PostMapping("/addMember")
    public void addMember(@RequestBody Member newMember){
        memberService.addMember(newMember);
    }
}
