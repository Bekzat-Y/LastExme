package com.jdbc.jwt.service.impl;

import com.jdbc.jwt.entity.User;
import com.jdbc.jwt.enums.Status;
import com.jdbc.jwt.repo.UserRepo;
import com.jdbc.jwt.service.SecurityServiceCRUD;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class SecurityImplCRUD implements SecurityServiceCRUD {

    private final UserRepo userRepo;

    @Override
    public void createUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void blockUserID(Long userId) {
        User blockUser = new User();
         userRepo.findById(userId);
        blockUser.setStatus(Status.BLOCK);
    }


    @Override
    public void unlockUser(Long id) {
        User unlockUser = new User();
         userRepo.findById(id);
         unlockUser.setStatus(Status.UNLOCK);
    }

    @Override
    public Long deleteUser(Long userId) {
        User deleteStatus = new User();
        userRepo.deleteById(userId);
        deleteStatus.setStatus(Status.DELETE);
        return userId;
    }

}
