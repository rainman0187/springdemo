package com.rezwan.service;  

import java.util.List;

import com.rezwan.model.User;

public interface UserService {

    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUser(String id);
    public List<User> getAllUser();
}
