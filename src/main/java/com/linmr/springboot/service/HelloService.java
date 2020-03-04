package com.linmr.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author linmr
 * @version 1.0
 * @date  2020-2-27  9:38
 * description SpringBoot初体验
 */
@RestController
public class HelloService {
    private static final Logger logger = LoggerFactory.getLogger(HelloService.class);
    @RequestMapping("/do")
    public HashMap doService(){
        HashMap<String,String> map  = new HashMap<>(16);
        map.put("name","林明荣");
        map.put("age","27");
        map.put("email","lmr163mailz@163.com");
        logger.info("HelloService info logs 加载成功！");
        return map;
    }
}
