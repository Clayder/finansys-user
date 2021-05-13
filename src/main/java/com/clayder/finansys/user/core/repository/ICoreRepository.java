package com.clayder.finansys.user.core.repository;

import com.clayder.finansys.user.core.entity.AbstractCoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoreRepository<T extends AbstractCoreEntity> extends JpaRepository<T, Long> {
}

