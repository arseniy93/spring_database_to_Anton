package com.aop.repository;

import org.springframework.stereotype.Component;

@Component
public class RepositoryImpl implements Repository{
    public String prinf(){
        System.out.println("RepoImpl");
        return "lol";
    }

    @Override
    public String exit() {
        return "sfsdf";
    }
}
