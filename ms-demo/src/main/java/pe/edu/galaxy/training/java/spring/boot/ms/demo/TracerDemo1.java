package pe.edu.galaxy.training.java.spring.boot.ms.demo;

import java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/demos")
public class TracerDemo1 {

	@GetMapping
	public String demo1() {
		String message = "Spring Boot Demo 1 " + LocalDate.now();
		log.info(message);
		return message;
	}
	
}
