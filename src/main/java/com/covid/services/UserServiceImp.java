package com.covid.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.covid.entities.User;
import com.covid.repositories.UserRepository;
import com.covid.security.payload.request.SignupRequest;
import com.covid.security.services.IAuthenticationFacade;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private IAuthenticationFacade authenticationFacade;
	
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User updateUserProfile(SignupRequest signUpRequest) {
		User currentUser = this.authenticationFacade.getAuthenticatedUser();
		currentUser.setUsername(signUpRequest.getUsername());
		currentUser.setEmail(signUpRequest.getEmail());
		currentUser.setPassword(encoder.encode(signUpRequest.getPassword()));
		return this.userRepo.save(currentUser);
	}
}
