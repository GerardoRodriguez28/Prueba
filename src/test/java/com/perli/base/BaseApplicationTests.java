package com.perli.base;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
public class BaseApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMain(){
		SpringApplication.run(BaseApplication.class);

	}

}
