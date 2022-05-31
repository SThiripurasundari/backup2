package com.test.patterns.BuilderAndProto;

public class Phonebuilder {
	private String price;
	private String size;
	private String name;
	
	
	
	public Phonebuilder setPrice(String price) {
		this.price = price;
		return this;
	}

	public Phonebuilder setSize(String size) {
		this.size = size;
		return this;
	}

	public Phonebuilder setName(String name) {
		this.name = name;
		return this;
	}	

	public Phone getPhone() {

		return new Phone(price, size, name);
	}

}
