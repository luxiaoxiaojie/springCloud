package com.xjlu.demo.service;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "test1",fallback = HystrixService.class)
public interface SchedualService {

    @RequestMapping(value = "/s",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
