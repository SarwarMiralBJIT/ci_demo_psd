package com.example.ci_demo_psd;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiDemoPsdApplicationTests {

	static Logger logger = LoggerFactory.getLogger(CiDemoPsdApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("It's the first test!");
		assertEquals(true, true);
	}

	@Test
	void demoTest() {
		logger.info("It's the second test!");
		assertEquals(true, true);
	}

}
