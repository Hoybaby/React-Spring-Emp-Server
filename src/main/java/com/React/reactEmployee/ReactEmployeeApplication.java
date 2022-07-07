package com.React.reactEmployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

public class ReactEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactEmployeeApplication.class, args);
	}

}
