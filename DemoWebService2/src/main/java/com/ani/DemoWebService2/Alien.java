package com.ani.DemoWebService2;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Alien [name=" + name + ", point=" + point + "]";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	private String name ;

	private int point;

}
