package com.user.module.repositories;

import com.user.module.entities.Users;

public interface LoginDao {
	Users findByUserName(String username);
}
