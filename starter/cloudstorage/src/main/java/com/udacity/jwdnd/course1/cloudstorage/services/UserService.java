package com.udacity.jwdnd.course1.cloudstorage.services;

import mapper.UserMapper;
import model.User;

import java.security.SecureRandom;
import java.util.Base64;

public class UserService {
    private final UserMapper userMapper;
    private final HashService hashService;

public UserService(UserMapper userMapper, HashService hashService) {
    this.userMapper = userMapper;
    this.hashService = hashService;
}
    public void createUser(User user) {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        String encodedSalt = Base64.getEncoder().encodeToString(salt);
        String hashedPassword = hashService.getHashedValue(user.getPassword(), encodedSalt);
    }
}
