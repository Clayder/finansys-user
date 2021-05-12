package com.clayder.finansys.user.app.service;

import com.clayder.finansys.user.app.entity.User;
import com.clayder.finansys.user.core.service.ICoreService;

import java.util.List;

public interface IUserService extends ICoreService {
    List<User> getAll();
}
