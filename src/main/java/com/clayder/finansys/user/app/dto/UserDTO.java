package com.clayder.finansys.user.app.dto;

import com.clayder.finansys.user.core.dto.AbstractCoreDto;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO extends AbstractCoreDto {

    private String name;
    private String email;

    @Builder
    public UserDTO(Long id, Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt, String name, String email) {
        super(id, createdAt, updatedAt, deletedAt);
        this.name = name;
        this.email = email;
    }
}
