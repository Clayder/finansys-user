package com.clayder.finansys.user.app.service;

import com.clayder.finansys.user.app.entity.User;
import com.clayder.finansys.user.app.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    IUserRepository repository;

    public UserService(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }
}
