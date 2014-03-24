package com.rezwan.service;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rezwan.dao.UserDAO;
import com.rezwan.model.User;

@Service
public class UserService {

  @Autowired
  private UserDAO userDAO;
 

  
  @Transactional
  public void updateUser(User user) {
    userDAO.updateUser(user); 
  }

  @Transactional
  public void saveUser(User user) {
    userDAO.saveUser(user);
   
  }

}
