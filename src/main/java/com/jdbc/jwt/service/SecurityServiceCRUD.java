package com.jdbc.jwt.service;

import com.jdbc.jwt.entity.User;

public interface SecurityServiceCRUD {

    void createUser(User user);

    void blockUserID(Long userId);

    void unlockUser(Long id);

    Long deleteUser(Long userId);
}
