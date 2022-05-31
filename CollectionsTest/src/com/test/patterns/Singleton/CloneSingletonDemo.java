package com.test.patterns.Singleton;

public class CloneSingletonDemo implements Cloneable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
