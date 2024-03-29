package com.jdbc.jwt.controller;

import com.jdbc.jwt.entity.User;
import com.jdbc.jwt.enums.Status;
import com.jdbc.jwt.service.SecurityServiceCRUD;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SecurityController {

    private final SecurityServiceCRUD serviceCRUD;

    @PostMapping("/create")
    public User createUser(User user){
        serviceCRUD.createUser(user);
      return user;
    }

    @PutMapping("/blockUser")
    public Long blockUser(Long id){
        User status = new User();
        serviceCRUD.blockUserID(id);
        status.setStatus(Status.BLOCK);
    return 200L;
    }
    @PutMapping("/unlockUser")
    public Long unlockUser(Long id){
        User userStatus = new User();
        userStatus.setStatus(Status.UNLOCK);
        serviceCRUD.unlockUser(id);
        return 200L;
    }

    @DeleteMapping("/deleteUser")
    public Long deleteUser(Long id){
        User userDelete = new User();
        userDelete.setStatus(Status.DELETE);
return serviceCRUD.deleteUser(id);

    }



}
