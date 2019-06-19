package com.wonyong.springboot;

import org.springframework.data.annotation.Id;

public class MyDataMongo {
	
	private String id;
	
	private String name;
	private String address;
	private String memo;

	private Integer number;
	
	public MyDataMongo(String name, String address, String memo, Integer number) {

		super();
		this.name = name;
		this.address = address;
		this.memo =  memo;
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}


}