package com.clayder.finansys.user.app.user.service;

import com.clayder.finansys.user.app.dto.UserDTO;
import com.clayder.finansys.user.app.entity.User;
import com.clayder.finansys.user.app.repository.IUserRepository;
import com.clayder.finansys.user.app.service.IUserService;
import com.clayder.finansys.user.app.service.UserService;
import com.clayder.finansys.user.app.user.mock.UserMock;
import com.clayder.finansys.user.core.config.ApplicationConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Import(ApplicationConfig.class)
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
public class UserServiceTest {

    IUserService service;

    @MockBean
    IUserRepository repository;

    @BeforeEach
    public void setUp() {
        this.service = new UserService(repository, new ModelMapper());
    }

    @Test
    @DisplayName("Returning all users.")
    public void getAllUsers() {
        List<User> mockList = new ArrayList<>();
        mockList.add(UserMock.getWithId());

        Mockito.when(repository.findAll()).thenReturn(mockList);

        List<User> allUsers = service.getAll();

        assertThat(allUsers.size()).isGreaterThan(0);
        assertThat(allUsers.get(0).getName()).isEqualTo(UserMock.getWithId().getName());
        assertThat(allUsers.get(0).getEmail()).isEqualTo(UserMock.getWithId().getEmail());
        assertThat(allUsers.get(0).getId()).isEqualTo(UserMock.getWithId().getId());
        assertThat(allUsers.get(0).getCreatedAt()).isNotNull();
        assertThat(allUsers.get(0).getUpdatedAt()).isNull();
        assertThat(allUsers.get(0).getDeletedAt()).isNull();
    }

    @Test
    @DisplayName("Convert user list to DTO list.")
    public void convertUserListToDTOList() {
        List<User> mockList = new ArrayList<>();

        Mockito.when(repository.findAll()).thenReturn(mockList);

        List<UserDTO> userDTOList = service.mapList(mockList, UserDTO.class);

        assertThat(userDTOList.get(0).getClass()).isEqualTo(UserDTO.class);
    }



}
