package com.example.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * boot
 * Created by nantian on 2018/5/8.
 */
@Configuration
@PropertySource(value = "classpath:testConfig.properties")
@ConfigurationProperties(prefix = "com.user")
public class ConfigForTestBean {

    private String age;
    private String name;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConfigForTestBean{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
