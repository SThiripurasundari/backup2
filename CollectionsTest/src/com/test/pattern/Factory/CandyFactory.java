package com.test.pattern.Factory;

public class CandyFactory extends ChoclateFactory {

	@Override
	public Cholcate getChoclate(String input) {

		Cholcate candy = null;
		if ("Dark".equals(input)) {

			return new DarkCandy();
		} else if ("White".equals(input)) {

			return new WhiteCandy();
		}

		return candy;
	}

}
