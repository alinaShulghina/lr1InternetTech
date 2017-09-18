package com.diit.piclib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by alin- on 11.09.2017.
 */
@EnableAutoConfiguration
@ComponentScan
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
}
