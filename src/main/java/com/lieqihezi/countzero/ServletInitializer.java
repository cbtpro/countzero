package com.lieqihezi.countzero;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author peter
 * 采用容器的方式启动，正常使用CountzeroApplication.java启动
 */
@SpringBootApplication
public class ServletInitializer extends SpringBootServletInitializer {

	static final Logger logger = LoggerFactory.getLogger(CountzeroCommandLineRunner.class);
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		logger.info("Application start by Spring bootServletInitializer.");
		return application.sources(ServletInitializer.class);
	}

}
