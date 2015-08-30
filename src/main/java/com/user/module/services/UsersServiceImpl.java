package com.user.module.services;

import com.user.module.entities.Users;
import com.user.module.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersRepository usersRepository;

	@Override
	public Users save(Users users) {
		return usersRepository.save(users);
	}

}
