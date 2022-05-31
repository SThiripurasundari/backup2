package com.first.SpringTutorial;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpringSamples implements BeanPostProcessor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApplicationContext  application = new ClassPathXmlApplicationContext("com/first/SpringTutorial/spring.xml");
		AbstractApplicationContext  application = new ClassPathXmlApplicationContext("com/first/SpringTutorial/spring.xml");
		Vehicle veh = (Car)application.getBean("car");
		veh.ride(); 
		
		//can be placed anywhere but the destroy method will be automatcially called at the end 
		application.registerShutdownHook();
		 veh = (Bike)application.getBean("bike");
		 veh.ride();
		 
		 Tyre tyre = (Tyre)application.getBean("tyre");
		 System.out.println("tyre "+tyre);
		 
		
		
	}
	 public Object postProcessBeforeInitialization(Object bean, String beanName) 
		      throws BeansException {
		      
		      System.out.println("BeforeInitialization : " + beanName);
		      return bean;  // you can return any other object as well
		   }
		   public Object postProcessAfterInitialization(Object bean, String beanName) 
		      throws BeansException {
		      
		      System.out.println("AfterInitialization : " + beanName);
		      return bean;  // you can return any other object as well
		   }

}
