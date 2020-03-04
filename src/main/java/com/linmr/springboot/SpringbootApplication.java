package com.linmr.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author linmr
 * @version 1.0
 * @date 2020-2-27  9:03
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
