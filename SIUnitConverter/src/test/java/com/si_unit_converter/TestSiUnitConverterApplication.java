package com.si_unit_converter;

import org.springframework.boot.SpringApplication;

public class TestSiUnitConverterApplication {

	public static void main(String[] args) {
		SpringApplication.from(SiUnitConverterApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
