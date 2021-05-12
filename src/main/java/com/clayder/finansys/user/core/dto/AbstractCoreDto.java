package com.clayder.finansys.user.core.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractCoreDto {

    private Long id;

    @JsonProperty("created_at")
    private Timestamp createdAt;

    @JsonProperty("updated_at")
    private Timestamp updatedAt;

    @JsonProperty("deleted_at")
    private Timestamp deletedAt;


}

