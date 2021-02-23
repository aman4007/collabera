package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.config.YamlPropertyRead;

@SpringBootApplication
public class YamlReadApplication implements CommandLineRunner{
	
	
	 @Autowired
	 private YamlPropertyRead propertyRead;


	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(YamlReadApplication.class);
		application.run();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Spring.profile.active : " + propertyRead.getSpring());
        System.out.println("Thread-pool: " + propertyRead.getThread());
        System.out.println("Server IP List: " + propertyRead.getServers());
		
	}

}
