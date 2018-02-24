package com.xjlu.demo.service;

import org.springframework.stereotype.Component;

/**
 * Created by 陆小杰 on 2018/2/24.
 */
@Component
public class HystrixService implements SchedualService {
    @Override
    public String sayHiFromClientOne(String name) {
        return name+"===sorry";
    }
}
