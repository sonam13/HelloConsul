package com.example.HelloConsul;


import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

import com.orbitz.consul.model.agent.ImmutableRegCheck;
//@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
//@EnableConfigurationProperties
@SpringBootApplication
@Generated({"Immutables.generator", "Registration.RegCheck"})
public class HelloConsulApplication {
	//com.orbitz.consul.model.agent.ImmutableRegCheck i=new ImmutableRegCheck(null,null,null,null,null,null,null,null,null,null);
	public static void main(String[] args) {

		SpringApplication.run(HelloConsulApplication.class, args);
	}

	
}
