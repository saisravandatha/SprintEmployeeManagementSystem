package com.capg.ems.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.ems.dto.UserDTO;
import com.capg.ems.entities.User;
import com.capg.ems.exceptions.UserNotFoundException;
import com.capg.ems.service.ILoginServiceImpl;

@RestController
public class UserManagementController {

	static final Logger logger = LogManager.getLogger(UserManagementController.class.getName());

	@Autowired
	private ILoginServiceImpl loginService;

	// displaying list of all users
	@GetMapping("/users")
	public List<UserDTO> getAllUsers() {
		return loginService.getAllUsers();
	}

	// inserting users
	@PostMapping("/users")
	public @ResponseBody String addUser(@RequestBody @Valid UserDTO user) {
		loginService.addUser(user);
		return "User Added Successfully";
	}

	// updating user by id
	@PutMapping("/users/{id}")
	public @ResponseBody String updateUser(@RequestBody @Valid UserDTO u) {
		loginService.updateUser(u);
		return "User Updated Successfully";
	}

	// deleting user by id
	@DeleteMapping("users/{id}")
	public @ResponseBody String deleteUser(@RequestBody User u, @PathVariable int id) {
		loginService.deleteUser(id);
		return "User Deleted Successfully";
	}

	// getting user by id
	@GetMapping("/finduser/{id}")
	public ResponseEntity<Optional<User>> findUserById(@PathVariable("id") int id) throws UserNotFoundException {
		Optional<User> findagent = loginService.findUserbyId(id);
		if (findagent == null)
			return new ResponseEntity("No Agent Found for given Id", HttpStatus.NOT_FOUND);
		return new ResponseEntity(findagent, HttpStatus.OK);
	}
}
