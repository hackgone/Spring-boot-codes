package com.piyush.springcodedemo.rest;

import com.piyush.springcodedemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //dependency
    private Coach myCoach;
    //constructor for dependency injection
//    @Autowired
//    DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }
    @Autowired
    public DemoController(@Qualifier("swimCoach")Coach theCoach){
        System.out.println("this is controller of"+getClass().getSimpleName());
        this.myCoach = theCoach;
    }
    @GetMapping("/dailyworkout")
    public String dailyWorkpout(){
        return myCoach.getDailyWorkout();
    }
}
