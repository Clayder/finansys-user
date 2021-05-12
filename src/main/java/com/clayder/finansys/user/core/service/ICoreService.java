package com.clayder.finansys.user.core.service;

import java.util.List;

public interface ICoreService {
    <S, T> List<T> mapList(List<S> source, Class<T> targetClass);
}
