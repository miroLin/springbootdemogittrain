package com.linmr.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linmr
 * @version 1.0
 * @date 2020-2-27  9:03
 */
@RestController
public class HelloController {

    @Value(value = "${logging.config},${debug}")
    private String appName;

    @RequestMapping(value = "/hello")
    public String hello(){
        return "你好，SpringBoot！\n" + appName;
    }
}
