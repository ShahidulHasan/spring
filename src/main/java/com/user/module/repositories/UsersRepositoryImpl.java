package com.user.module.repositories;

import com.user.module.entities.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository("UsersRepository")
public class UsersRepositoryImpl implements UsersRepository
{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    @Transactional
    public Users save(Users users) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(users);
        tx.commit();
        session.close();
        return users;
    }
}
