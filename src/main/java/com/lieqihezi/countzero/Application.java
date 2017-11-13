package com.lieqihezi.countzero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lieqihezi.countzero.domain.City;
import com.lieqihezi.countzero.repository.CityRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CityRepository cityRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	public void run(String... args) throws Exception {
		cityRepository.deleteAll();
		
		cityRepository.save(new City("北京", "中国"));
		cityRepository.save(new City("上海", "中国"));
		
		cityRepository.save(new City("New York", "American"));
		
		for (City city : cityRepository.findAll()) {
			System.out.println(city);
		}
		System.out.println("\n");
		
		for (City city : cityRepository.findByName("北京")) {
			System.out.println(city);
		}
	}

}
