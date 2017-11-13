package com.lieqihezi.countzero;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class CountzeroCommandLineRunner1 implements CommandLineRunner, Ordered {

	static final Logger logger = LoggerFactory.getLogger(CountzeroCommandLineRunner1.class);
	
	public int getOrder() {
		return 1;
	}

	public void run(String... args) throws Exception {
		logger.info("Springboot 启动后执行这段代码");
	}

}
