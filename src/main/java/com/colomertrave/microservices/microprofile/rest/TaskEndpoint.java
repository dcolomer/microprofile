package com.colomertrave.microservices.microprofile.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/task")
public class TaskEndpoint {

	static List<Task> lista = new ArrayList<>(Arrays.asList(new Task(1, "Learning microprofile")));

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Task> doGet() {
		return lista;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response doPut(Task task) {
		lista.add(task);
		System.out.println("Task added, total: " + lista.size());
		System.out.println(lista);
		return Response.status(201).entity(task).build();
	}
}
