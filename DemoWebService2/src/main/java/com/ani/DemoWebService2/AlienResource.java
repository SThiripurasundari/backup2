package com.ani.DemoWebService2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource
{
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Alien getAlien()
	{
		
		System.out.println("inside getAlien");
		Alien a1 = new Alien();
		a1.setName("Anitha");
		a1.setPoint(80);
		
		System.out.println(a1.toString());
		return a1;
	}

}
