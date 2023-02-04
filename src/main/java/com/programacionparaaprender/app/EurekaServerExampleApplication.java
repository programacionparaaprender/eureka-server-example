package com.programacionparaaprender.app;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;  


@EnableEurekaServer
@SpringBootApplication
public class EurekaServerExampleApplication {
	 /* Get the class name to be printed on */  
	   static Logger log = Logger.getLogger(EurekaServerExampleApplication.class.getName());  
	public static void main(String[] args) throws IOException,SQLException{  
	      log.debug("Hello this is a debug message");  
	      log.info("Hello this is an info message");  
		SpringApplication.run(EurekaServerExampleApplication.class, args);
	}

}
