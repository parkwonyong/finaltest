package com.wonyong.springboot;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class MyDataMongo {
	
	private String id;
	
	private String name;
	private String address;
	private String memo;

	private int number;
	
	public MyDataMongo(String name, String address, String memo, int number) {

		super();
		this.name = name;
		this.address = address;
		this.memo =  memo;
		this.number = number;
	}
}