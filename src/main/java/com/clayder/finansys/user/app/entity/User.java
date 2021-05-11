package com.clayder.finansys.user.app.entity;

import com.clayder.finansys.user.core.entity.AbstractCoreEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User extends AbstractCoreEntity {

    private String name;
    private String email;

    @Builder
    public User(Long id, Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt, String name, String email) {
        super(id, createdAt, updatedAt, deletedAt);
        this.name = name;
        this.email = email;
    }
}
