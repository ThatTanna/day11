package sg.edu.nus.iss.workshop11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Workshop11Application {
	private static final Logger logger = LoggerFactory.getLogger(Workshop11Application.class);

	public static void main(String[] args) {
		logger.debug("test message: please ignore.");
		SpringApplication.run(Workshop11Application.class, args);

	}

}
