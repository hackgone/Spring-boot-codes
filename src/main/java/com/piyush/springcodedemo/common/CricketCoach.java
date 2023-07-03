package com.piyush.springcodedemo.common;

import com.piyush.springcodedemo.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("this is controller of"+getClass().getSimpleName());
    }
    //init
//    @PostConstruct
//    public void domywork(){
//        System.out.println("MYWORK START *************************");
//    }
//    @PreDestroy
//    public void destroymywork(){
//        System.out.println("DESTROY START *************************");
//    }
    @Override
    public String getDailyWorkout() {
        return "Practise fast Kid";
    }
}
