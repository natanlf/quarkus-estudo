package com.github.natanlf.log;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseFilter;

@ApplicationScoped
public class RegisterLogImpl implements RegisterLog {

	@Override
	public void register(ContainerRequestFilter req, ContainerResponseFilter res) {
		
		System.out.println("RegisterLogImpl request :"+req);
		System.out.println("RegisterLogImpl response :"+res);
	}

}
