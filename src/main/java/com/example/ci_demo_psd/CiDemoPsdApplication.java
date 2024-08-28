package com.example.ci_demo_psd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiDemoPsdApplication {

	static Logger logger = LoggerFactory.getLogger(CiDemoPsdApplication.class);
	public static void main(String[] args) {
		logger.info("This is a running job.");
		SpringApplication.run(CiDemoPsdApplication.class, args);
	}

}
