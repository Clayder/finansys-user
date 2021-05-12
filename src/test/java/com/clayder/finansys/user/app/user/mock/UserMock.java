package com.clayder.finansys.user.app.user.mock;

import com.clayder.finansys.user.app.entity.User;
import com.clayder.finansys.user.utils.DateUtils;

import java.sql.Timestamp;

public class UserMock {

    public static final long ID = 1L;
    public static final Timestamp CREATED_AT = DateUtils.createTimeStamp("2021-04-05");
    public static final Timestamp DELETED_AT = null;
    public static final String NAME = "Peter";
    public static final String EMAIL = "peterclayder@gmail.com";

    public static User get() {
        return User.builder()
                .createdAt(CREATED_AT)
                .deletedAt(DELETED_AT)
                .updatedAt(DELETED_AT)
                .email(EMAIL)
                .name(NAME)
                .build();
    }

    public static User getWithId() {
        User userMock = UserMock.get();
        userMock.setId(ID);
        return userMock;
    }
}
