package com.clayder.finansys.user.app.repository;

import com.clayder.finansys.user.app.entity.User;
import com.clayder.finansys.user.core.repository.ICoreRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IUserRepository extends ICoreRepository<User> {
    List<User> queryByNameLike(String name);
    Optional<User> getByName(String name);
}
