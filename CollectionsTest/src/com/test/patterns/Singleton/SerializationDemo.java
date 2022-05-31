package com.test.patterns.Singleton;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			SingletonImpl object1 = SingletonImpl.getInstance();
			
			//serialize input
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("C:/Users/a14459/Desktop/Anitha/ABC.text"));
			out.writeObject(object1);
			out.close();

			// deserialize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("C:/Users/a14459/Desktop/Anitha/ABC.text"));
			SingletonImpl object2 = (SingletonImpl) in.readObject();
			in.close();

			System.out.println("object1 hashCode:- " + object1.hashCode());
			System.out.println("object2 hashCode:- " + object2.hashCode());
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
