package br.com.zeroth.zthcarwashservice;

import org.springframework.boot.SpringApplication;

public class TestZthCarWashServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ZthCarWashServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
