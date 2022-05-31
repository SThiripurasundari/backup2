package com.test.patterns.Singleton;

public class SingletonRunThis {

	public static void main(String[] args) throws Exception {

		SingletonImpl impl = SingletonImpl.getInstance();
		SingletonImpl impl3 = SingletonImpl.getInstance();
		SingletonImpl impl4 = SingletonImpl.getInstance();

		// for clone sample
		// SingletonImpl impl2 = (SingletonImpl) impl.clone();
		System.out.println(impl);
		// System.out.println(impl2);
		System.out.println(impl4);
		System.out.println(impl3);

		if (impl4 == impl3) {
			System.out.println("equal ");

		}

	}
}
