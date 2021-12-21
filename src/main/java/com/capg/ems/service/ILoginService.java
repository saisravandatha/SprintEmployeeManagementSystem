package com.capg.ems.service;

import java.util.List;
import java.util.Optional;

import com.capg.ems.dto.UserDTO;
import com.capg.ems.exceptions.UserNotFoundException;

public interface ILoginService {

	public UserDTO addUser(UserDTO user);

	public void deleteUser(int userId);

	public UserDTO updateUser(UserDTO user);

	public List<UserDTO> getAllUsers();

	public Optional findUserbyId(int agentId) throws UserNotFoundException;

}
