package com.hachicore.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableConfigurationProperties(HachicoreProperties.class)
public class SpringinitApplication {

//	@ConfigurationProperties("server")
//	@Bean
//	public ServerProperties serverProperties() {
//		return new ServerProperties();
//	}

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringinitApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

}
