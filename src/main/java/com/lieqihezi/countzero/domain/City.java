package com.lieqihezi.countzero.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
public class City implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4660630504534885693L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	@Getter
	@Setter
	private String state;
	
	protected City() {
	}

	public City(String name, String state) {
		this.name = name;
		this.state = state;
	}

	@Override
	public String toString() {
		return String.format(
			"City[id='%s', name='%s', state='%s']",
			id, name, state);
	}
}
