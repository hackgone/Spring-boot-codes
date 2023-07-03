package com.piyush.springcodedemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        System.out.println("this is controller of"+getClass().getSimpleName());
        return "I am Baseball Coach";
    }
}
