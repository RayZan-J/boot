package com.example.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * boot
 * Created by nantian on 2018/5/8.
 */
@RestController
public class AgeController {

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private String age;

    @RequestMapping("/age")
    public String getAgeAndName(){
        return name+" : "+age;
    }

}
