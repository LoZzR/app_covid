package com.covid.services;

import com.covid.entities.User;
import com.covid.security.payload.request.SignupRequest;

public interface UserService {
	
	User updateUserProfile(SignupRequest signUpRequest);

}
