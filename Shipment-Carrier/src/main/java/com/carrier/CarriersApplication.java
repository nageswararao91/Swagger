package com.carrier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.carrier")
public class CarriersApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(CarriersApplication.class, args);
	}

}
