package com.github.natanlf.log;

import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseFilter;

public interface RegisterLog {
	void register(ContainerRequestFilter req, ContainerResponseFilter res);
}
