package com.clayder.finansys.user.app.user.repository;

import com.clayder.finansys.user.app.entity.User;
import com.clayder.finansys.user.app.repository.IUserRepository;
import com.clayder.finansys.user.app.user.mock.UserMock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    TestEntityManager entityManager;

    @Autowired
    IUserRepository repository;

    @Test
    @DisplayName("Returning users by like name.")
    void findByUserNameTest() {
        User user = UserMock.get();
        entityManager.persist(user);

        List<User> userList = repository.queryByNameLike(user.getName());

        assertThat(userList.size()).isGreaterThan(0);
    }

    @Test
    @DisplayName("Returning user by name.")
    void getUserByNameTest() {
        User user = UserMock.get();
        entityManager.persist(user);

        Optional<User> foundUser = repository.getByName(user.getName());

        assertThat(foundUser.isPresent()).isTrue();
    }
}
