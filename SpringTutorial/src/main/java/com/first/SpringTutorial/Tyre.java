package com.first.SpringTutorial;

public class Tyre {
	
	 

	private String brand;
	private String constBrand;
	
	
	public Tyre(String constBrand) {
		super();
		//this.brand = brand;
		this.constBrand = constBrand;
	}
	public void init() {
	      System.out.println("Tesing Init method");
	   }
	

	public String getConstBrand() {
		return constBrand;
	}

	public void setConstBrand(String constBrand) {
		this.constBrand = constBrand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + ", constBrand=" + constBrand + "]";
	}
	public void destroy() {
	      System.out.println("Tesing destroy method");
	   }
	
	

}
