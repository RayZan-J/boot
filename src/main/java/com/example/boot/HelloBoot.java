package com.example.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * boot
 * Created by nantian on 2018/5/8.
 */
@RestController
public class HelloBoot {

    @RequestMapping("/")
    public String index(){
        return "get XX from SpringBoot.";
    }
}
