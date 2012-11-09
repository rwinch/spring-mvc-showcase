package org.springframework.samples.services;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UsernameMessageService implements MessageService {
	public String getMessage() {
		SecurityContext securityContext = SecurityContextHolder.getContext();
		Authentication authentication = securityContext.getAuthentication();
		if(authentication == null) {
			return "user = null";
		}
		return "user = " + authentication.getName();
	}
}
