package com.test.InterfaceTest;

import com.diamondIssue.InterFace1;

enum Level {
	LOW, MEDIUM, HIGH
}

public class Check1 extends AbstarctClass implements Interface2, Interface1 {

	public static void main(String ags[]) {
		Check1 face1 = new Check1();
		face1.methods22();
		face1.methods2();
		face1.methods1();

	}

	@Override
	public void methods1() {
		switch (Level.HIGH) {

		}
		System.out.println("methods1 inside ");

	}

	@Override
	public void methods2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void methods() {
		// TODO Auto-generated method stub

	}

}
