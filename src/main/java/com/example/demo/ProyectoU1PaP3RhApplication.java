package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.service.IPropietarioService;

@SpringBootApplication
public class ProyectoU1PaP3RhApplication implements CommandLineRunner {

	@Autowired
	private IPropietarioService pro;
	

//	@Autowired



	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PaP3RhApplication.class, args);
	}


@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	
}

}
