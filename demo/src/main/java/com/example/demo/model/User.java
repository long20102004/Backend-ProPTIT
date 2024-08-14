package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private String age;
    private String description;
    private String additionalDes;
    public User() {
        this.name = "Long Hoang";
        this.age = "20";
        this.description = "I'll be 20 by this October. Job skills: Java Spring Boot, ReactJs,..." +
                " mostly related to web developer. Some other skills: Languages: English and Japanese (intermediate), Competitive programming, ..." ;
        this.additionalDes = "I'm willing to learn new things and have the ability to join any workspace. Hire me!";
    }
}
