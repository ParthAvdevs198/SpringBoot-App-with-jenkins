package com.avdevs.Jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	public static final Logger logger = LoggerFactory.getLogger(JenkinsApplication.class);

	public static void main(String[] args) {
		logger.info("Its a continous integration job.............");
		SpringApplication.run(JenkinsApplication.class, args);
	}



}
