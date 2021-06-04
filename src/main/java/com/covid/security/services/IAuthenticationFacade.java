package com.covid.security.services;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;

import com.covid.entities.User;

public interface IAuthenticationFacade {

	Authentication getAuthentication();
	
	UserDetails getUserDeyails();
	
	Long getIdAuthenticatedUser();
	
	User getAuthenticatedUser();
}
