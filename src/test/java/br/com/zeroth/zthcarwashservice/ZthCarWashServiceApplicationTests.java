package br.com.zeroth.zthcarwashservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ZthCarWashServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
