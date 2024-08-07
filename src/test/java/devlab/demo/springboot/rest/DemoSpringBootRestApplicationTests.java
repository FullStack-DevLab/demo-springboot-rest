package devlab.demo.springboot.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration(classes = DemoSpringBootRestApplication.class)
class DemoSpringBootRestApplicationTests {
	@Autowired
	private ApplicationContext context;

	@Test
	void contextLoads() {
		assertThat(context.containsBean("demoSpringBootRestApplication")).isTrue();
	}

}