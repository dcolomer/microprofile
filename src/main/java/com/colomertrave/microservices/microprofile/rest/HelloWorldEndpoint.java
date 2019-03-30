package com.colomertrave.microservices.microprofile.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;


@Path("/task")
public class HelloWorldEndpoint {

	@GET
	@Produces("application/json")
	public List<Task> doGet() {
		Task t1 = new Task(1, "Learning microprofile");
		final List<Task> lista = List.of(t1);
		return lista;
	}
}
