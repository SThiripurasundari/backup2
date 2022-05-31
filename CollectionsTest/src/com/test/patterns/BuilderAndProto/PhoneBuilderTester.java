package com.test.patterns.BuilderAndProto;

public class PhoneBuilderTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone ph = new Phonebuilder().setName("Yes").setPrice("65").getPhone();
		System.out.println("ph :" + ph);

		// This code for prototype
		Phone ph2 = ph.clone();
		System.out.println("ph 2:" + ph2);
		ph2.setName("Yes 2");
		ph2.setSize("34");
		System.out.println("ph 2:" + ph2);
	}

}
