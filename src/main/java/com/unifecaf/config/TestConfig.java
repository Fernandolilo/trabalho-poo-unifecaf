package com.unifecaf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.RequiredArgsConstructor;

@Configuration
@Profile("test")
@RequiredArgsConstructor
public class TestConfig {

	//class feita para iniciar DB para tests.
	
	
	//private final StartDB start;
	
	@Bean
	public boolean init() {
		//start.initDB();
		return true;
	}

}
