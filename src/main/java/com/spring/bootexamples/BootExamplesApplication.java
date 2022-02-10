package com.spring.bootexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BootExamplesApplication {

	public static void main(String[] args) {
		String property = System.getProperty("spring.profiles.active");
		System.out.println("profiles currently set:::" + property);
		SpringApplication.run(BootExamplesApplication.class, args);
	}

}
