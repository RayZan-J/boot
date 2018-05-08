package com.example.boot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * boot
 * Created by nantian on 2018/5/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloBootTest {
    @LocalServerPort
    private int prot;
    private URL base;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Before
    public void setUp() throws MalformedURLException {
        this.base = new URL("http://localhost:"+prot+"/");
    }
    @Test
    public void hello(){
        ResponseEntity<String> responseEntity = testRestTemplate.getForEntity(base.toString(),String.class);
        assert (responseEntity.getBody().equals("get XX from SpringBoot."));
    }

}
