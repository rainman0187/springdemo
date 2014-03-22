package com.rezwan.dao;

import com.rezwan.model.Album;

public interface UsersDAO {
	public void selectUserById(long id); 
	public void insertUser(Album user);
	public void updateUser(Album user); 
	public void deleteUser(Album user); 
}
