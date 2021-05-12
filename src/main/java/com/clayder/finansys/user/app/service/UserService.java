package com.clayder.finansys.user.app.service;

import com.clayder.finansys.user.app.entity.User;
import com.clayder.finansys.user.app.repository.IUserRepository;
import com.clayder.finansys.user.core.service.AbstractCoreService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends AbstractCoreService implements IUserService{

    IUserRepository repository;

    public UserService(IUserRepository repository, ModelMapper modelMapper) {
        super(modelMapper);
        this.repository = repository;
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }
}
