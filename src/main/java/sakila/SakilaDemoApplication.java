package sakila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class SakilaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SakilaDemoApplication.class, args);
		Object o =new Object();
	}

}