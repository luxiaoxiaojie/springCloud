package com.xjlu.demo.control;

import com.xjlu.demo.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiController {

    @Autowired
    SchedualService schedualService;

    @RequestMapping(value = "/sss",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualService.sayHiFromClientOne(name);
    }
}
