package at.spring_boot.boilerplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"at.spring_boot.boilerplate"})
public class BoilerplateWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoilerplateWebApplication.class, args);
	}
}
