package com.test.pattern.Factory;

public class GumFactory extends ChoclateFactory{

	@Override
	public Cholcate getChoclate(String input) {

		Cholcate candy = null;
		if ("Dark".equals(input)) {

			return new DarkGum();
		} else if ("White".equals(input)) {

			return new WhiteGum();
		}

		return candy;
	}

}
