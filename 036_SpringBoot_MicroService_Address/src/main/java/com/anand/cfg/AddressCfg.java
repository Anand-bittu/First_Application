package com.anand.cfg;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressCfg {

	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}
}
