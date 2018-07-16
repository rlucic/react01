package com.ro.react01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class React01Application implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger("Batch01Application");
	
	public static void main(String[] args) {
		System.out.println("---> Before run(.....)");
		SpringApplication.run(React01Application.class, args);
		System.out.println("---> After run(.....)");		
	}

	@Override
	public void run(String... arg0) throws Exception {
		for(int i=0; i<10; i++){
			logger.info("Published shipment number {}.", i);
		}
		
	}
	
	
}
