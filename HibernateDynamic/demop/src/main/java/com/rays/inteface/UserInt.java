package com.rays.inteface;

import java.util.List;

import com.rays.dto.UserDTO;

public interface UserInt {
	public void add(UserDTO dto);
	public void update(UserDTO dto);
	public void delete(UserDTO dto);
	public List search(UserDTO dto ,int pageNo,int pageSize);
	public UserDTO findByPk(int pk);
}
