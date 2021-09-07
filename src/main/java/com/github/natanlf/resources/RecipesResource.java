package com.github.natanlf.resources;

import java.util.Optional;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.github.natanlf.entities.Recipe;
import com.github.natanlf.service.RecipesService;

@Path("restaurantes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RecipesResource {
	
	@Inject
	RecipesService service;
	
	@GET
	public Response getAll() throws Exception {
		return Response.ok(Optional.ofNullable(service.getAll(Recipe.class))).build();
	}
	
}
