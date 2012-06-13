package ru.spbstu.telematics.student.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class HelloService {
	
	@GET
	@Produces("text/plain")
	@Path("/{name}")
	public String sayHello(@PathParam("name") String name, @QueryParam("q") String symbol) {
		
		String r = "Hello, " + name;
		
		if (symbol != null) {
			r = r + " " + symbol;
		}
		
		return r;
	}
	
}
