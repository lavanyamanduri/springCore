package com.bridgelabz.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeans {
   
    @Bean(name="person")
    public Person getPerson(){
        Person p = new Person();
        p.setName("Kaushal");
        p.setAge(26);
        p.setDepartment("B.Arch");
        return p;
    }
 
}