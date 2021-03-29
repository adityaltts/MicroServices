package com.ltts.Project_MicroServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProjectMicroServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMicroServicesApplication.class, args);
	}

}
