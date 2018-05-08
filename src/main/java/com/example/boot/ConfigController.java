package com.example.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * boot
 *
 * @author nantian
 * @date 2018/5/8
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class,ConfigForTestBean.class})
public class ConfigController {

    @Autowired
    ConfigBean configBean;
    @RequestMapping("/config")
    public String getConfig(){
        return configBean.toString();
    }

    @Autowired
    ConfigForTestBean configForTestBean;

    @RequestMapping("/test")
    public String getConfigTest(){
        return configForTestBean.toString();
    }
}
