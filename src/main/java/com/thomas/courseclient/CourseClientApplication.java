package com.thomas.courseclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan("com.thomas.courseclient")
public class CourseClientApplication {
	private static final Logger logger = LoggerFactory
			.getLogger(CourseClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CourseClientApplication.class, args);
		logger.debug(" ----- Running CourseClientApplication ------- ");
	}
}
