package com.test.patterns.Singleton;

import java.lang.reflect.Constructor;

public class ReflectionDemo {

	public static void main(String[] args) {
		
		SingletonImpl object1 = SingletonImpl.getInstance();
		SingletonImpl object2 = null;
		try {
			Constructor[] constructors = SingletonImpl.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				object2 = (SingletonImpl) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("object1 .hashCode():- " + object1.hashCode());
		System.out.println("object2.hashCode():- " + object2.hashCode());
	}
}
