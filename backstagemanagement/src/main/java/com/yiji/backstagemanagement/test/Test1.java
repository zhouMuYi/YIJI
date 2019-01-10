package com.yiji.backstagemanagement.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {

    @RequestMapping("/test")
    public String hello() {
        return "22222";
    }
}
