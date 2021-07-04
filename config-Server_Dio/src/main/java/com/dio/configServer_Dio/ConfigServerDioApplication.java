package com.dio.configServer_Dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerDioApplication.class, args);
	}

}
