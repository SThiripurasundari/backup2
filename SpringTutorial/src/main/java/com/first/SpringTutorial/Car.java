package com.first.SpringTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	

	private Tyre trye;	
	
	public Tyre getTrye() {
		return trye;
	}

	public void setTrye(Tyre trye) {
		this.trye = trye;
	}

	public void ride() {
	
		System.out.println("I am inside Car : "+trye);
	
	}
	
	

}


