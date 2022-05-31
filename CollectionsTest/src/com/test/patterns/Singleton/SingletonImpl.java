package com.test.patterns.Singleton;

import java.io.Serializable;

public class SingletonImpl implements Serializable, Cloneable {

	static SingletonImpl singleObj = null;
	// final static SingletonImpl singleObj = new SingletonImpl();

	// 1. To overcome reflection api calling constructor and destroying singleton
	private SingletonImpl() {
		if (singleObj != null) {
			throw new RuntimeException("Do not try to break the Singleton class");
		}
	}

	// 2.synchronized to avoid thread creating multiple objects
	protected synchronized static SingletonImpl getInstance() {

		if (singleObj == null) {

			//using double check syn method - if getInstance does more work then just object creation then we can syn only the below object creation code alone
			synchronized (SingletonImpl.class) {
				if (singleObj == null)
				singleObj = new SingletonImpl();
			}
		}
		return singleObj;
	}

	// 3. To avoid serialization break singleton
	protected Object readResolve() {
		return singleObj;
	}

	// 3. To avoid Cloneable break singleton
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// return super.clone();

		throw new CloneNotSupportedException();
	}

}