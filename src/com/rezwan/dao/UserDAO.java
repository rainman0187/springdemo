package com.rezwan.dao;

import java.util.List;

import com.rezwan.model.User;

public interface UserDAO {

    public void saveUser(User user);
    public void updateUser(User user);
    
}
