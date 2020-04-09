package com.linmr.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author linmr
 * @version 1.0
 * @date 2020-3-17  14:37
 */
@SpringBootTest
class SpringBootRedisApplicationTests {

    @Autowired
    private RedisTemplate<String, String> strRedisTemplate;

    @Test
    void testString() {
        strRedisTemplate.opsForValue().set("strKey","测试操作……");
        System.out.println(strRedisTemplate.opsForValue().get("strKey"));
        System.out.println(strRedisTemplate.opsForValue().get("hostname"));
        System.out.println(strRedisTemplate.opsForValue().get("hostaddr"));
        //strRedisTemplate.opsForValue().set("hostaddr","10.12.128.235:6379");
    }

}