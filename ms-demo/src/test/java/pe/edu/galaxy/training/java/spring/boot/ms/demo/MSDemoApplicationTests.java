package pe.edu.galaxy.training.java.spring.boot.ms.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.galaxy.training.java.spring.boot.ms.demo.MSDemo1Application;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = {MSDemo1Application.class})
class MSDemoApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
	}

}
