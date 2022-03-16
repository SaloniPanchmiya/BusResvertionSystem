package com.admin.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserRepo userRepo;
	
	@PostMapping("/save")
	public User addUser(@RequestBody User user)
	{
		return userRepo.save(user);
	}

}
