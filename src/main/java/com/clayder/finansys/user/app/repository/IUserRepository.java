package com.clayder.finansys.user.app.repository;

import com.clayder.finansys.user.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRepository extends JpaRepository<User, Long> {
    public List<User> queryByNameLike(String name);
}
