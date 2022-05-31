package com.ani.DemoWebService2;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

	
	//private static final Logger logger = LogManager.getLogger(MyRecource.class);  
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	private static final Logger logger = LogManager.getLogger(MyResource.class);
	  @GET
	  
	  @Produces(MediaType.TEXT_PLAIN) public String getIt()
	  {
	  System.out.println("Inside myresource"); return "Got it!";
	  
	  
	  }
	 
    

	
}
