package com.raju.authentication.service;

import com.raju.authentication.dto.UserDto;
import com.raju.authentication.model.User;

public interface UserService {
	
	User save(UserDto userDto);

}
