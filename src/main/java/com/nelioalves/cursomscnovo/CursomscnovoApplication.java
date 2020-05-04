package com.nelioalves.cursomscnovo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nelioalves.cursomscnovo.services.S3Service;

@SpringBootApplication
public class CursomscnovoApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(CursomscnovoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				
	}

	
}
