package com.lieqihezi.countzero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lieqihezi.countzero.listener.TestListener;

@SpringBootApplication  //包含了 @Configuration @EnableAutoConfiguration 等
public class CountzeroApplication {

	public static void main(String[] args) throws Exception{
		//SpringApplication.run(CountzeroApplication.class, args);
		SpringApplication app = new SpringApplication(CountzeroApplication.class);
		//关闭banner
		//app.setBannerMode(Banner.Mode.OFF);
		//添加监听 (监听启动顺序由实现的接口决定)
		app.addListeners(new TestListener());
		app.run(args);
	}
}
