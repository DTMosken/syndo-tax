package com.syndo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 启动程序
 * 
 * @author admin
 */
@EnableAsync
@EnableCaching
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class StartApplication {
	
	private static final Logger log = LoggerFactory.getLogger(StartApplication.class);
	
	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(StartApplication.class, args);
		log.info(
				  " ######   ##     ##   ######    ######   ########   ######    ######  \n"
				+ "##    ##  ##     ##  ##    ##  ##    ##  ##        ##    ##  ##    ## \n"
				+ "##        ##     ##  ##        ##        ##        ##        ##       \n"
				+ " ######   ##     ##  ##        ##        ######     ######    ######  \n"
				+ "      ##  ##     ##  ##        ##        ##              ##        ## \n"
				+ "##    ##  ##     ##  ##    ##  ##    ##  ##        ##    ##  ##    ## \n"
				+ " ######    #######    ######    ######   ########   ######    ######  \n");
	}
	
}