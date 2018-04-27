package com.lieqihezi.countzero;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author peter
 * springboot 初始化完成后开始工作
 * order可以对启动顺序进行调整
 */
@Component
public class CountzeroCommandLineRunner implements CommandLineRunner, Ordered {

	static final Logger logger = LoggerFactory.getLogger(CountzeroCommandLineRunner.class);
	
	public void run(String... args) throws Exception {
		logger.info("Springboot 初始化完成后执行这段代码");
	}

	public int getOrder() {
		return 0;
	}

}
