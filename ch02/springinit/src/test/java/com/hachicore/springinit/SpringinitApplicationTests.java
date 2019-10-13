package com.hachicore.springinit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
// @TestPropertySource(properties = { "hachicore.name=hibiki" })
//@SpringBootTest(properties = "hachicore.name=paulette")
@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest
public class SpringinitApplicationTests {

	@Autowired
	Environment environment;

	@Test
	public void contextLoads() {
		assertThat(environment.getProperty("hachicore.name"))
				// .isEqualTo("hachicore");
			.isEqualTo("hibiki");
	}
}
