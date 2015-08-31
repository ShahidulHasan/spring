package com.user.module.repositories;

import com.user.module.entities.Users;

import java.util.List;

public interface UsersRepository
{
    public Users save(Users users);

    public List<Users> list();
}
