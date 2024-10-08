package com.aop;


import com.aop.repository.RepositoryImpl;
import com.aop.service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
//@ComponentScan(value = "com.aop")
public class Config1 {
    @Bean
    public Service service(){
        return new Service();
    }

    @Bean
    public RepositoryImpl repository(){
        return new RepositoryImpl();
    }
}
