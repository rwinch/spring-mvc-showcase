package org.springframework.samples.services;

import org.springframework.security.access.annotation.Secured;

public interface MessageService {

	@Secured("ROLE_ADMIN")
	public String getMessage();
}
