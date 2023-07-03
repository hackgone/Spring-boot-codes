package com.piyush.springcodedemo.common;

public class SwimCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Injecting using Custom Spring Bean";
    }
}
