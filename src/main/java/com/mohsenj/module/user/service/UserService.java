package com.mohsenj.module.user.service;

import com.mohsenj.module.user.model.Role;
import com.mohsenj.module.user.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);

	User findUserAndRolesByUserId(long userId);
}
