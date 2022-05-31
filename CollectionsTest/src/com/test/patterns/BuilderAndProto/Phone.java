package com.test.patterns.BuilderAndProto;

public class Phone implements Cloneable {

	@Override
	public String toString() {
		return "Phone [price=" + price + ", size=" + size + ", name=" + name + "]";
	}
	private String price;
	public Phone(String price, String size, String name) {
		super();
		this.price = price;
		this.size = size;
		this.name = name;
	}
	private String size;
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
	
	
	
	//This is for prototype pattern 
	public Phone clone()
	{
		Phone ph = null;
		try {
			ph =  (Phone)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ph;
	}
	
}
