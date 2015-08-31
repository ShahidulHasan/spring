package com.user.module.services;

import com.user.module.entities.Users;

import java.util.List;

public interface UsersService {
	public Users save(Users users);
	public List<Users> list();
//	public Users user(String username);
}
