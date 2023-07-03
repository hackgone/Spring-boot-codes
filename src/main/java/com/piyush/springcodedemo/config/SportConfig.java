package com.piyush.springcodedemo.config;

import com.piyush.springcodedemo.common.Coach;
import com.piyush.springcodedemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){ //beam id therefore small
        return new SwimCoach(); //class object to be injected
    }
    //another way of making Beam id
    //@Beam("id_here") -> this will become our beam id not the function name now

}
