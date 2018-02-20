package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloWordService {

    @Autowired
    RestTemplate restTemplate;

    public String sss(String name){
        return  restTemplate.getForObject("http://TEST1/s?name="+name,String.class);
    }
}
