package com.aop.service;

import com.aop.annotation.Nick;
import com.aop.annotation.Sam;
import com.aop.repository.Repository;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@EnableAspectJAutoProxy
@org.springframework.stereotype.Service
@Component
public class Service {
    @Sam
    public void print(){
        System.out.println("class Service");
    }

    @Sam
    public String print(@Nick String name){
        System.out.println(name +"class Service");
        return name;
    }


//    @Override
//    public String exit() {
//        return "3123";
//    }
}
