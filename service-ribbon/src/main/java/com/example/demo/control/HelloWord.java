package com.example.demo.control;

import com.example.demo.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @Autowired
    HelloWordService helloWordService;

    @RequestMapping(value = "/sss")
    public String hi(@RequestParam String name){

        return helloWordService.sss(name);


    }
}
