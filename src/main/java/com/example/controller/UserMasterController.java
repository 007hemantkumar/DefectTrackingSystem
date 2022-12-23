package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.UserMaster;
import com.example.service.UserService;

@RestController

public class UserMasterController {
	@Autowired
	private UserService userService;

	@PostMapping("/add")
	public int saveUser(@RequestBody UserMaster userMaster) {
		return userService.save(userMaster);
	}

	@GetMapping("/get")
	public List<UserMaster> findAll() {
		return userService.findAll();
	}
	
	/*
	 * @PutMapping("/update") public void updateUser(@RequestBody UserMaster
	 * userMaster) { userService.update(userMaster); }
	 */
	
	  @DeleteMapping("/delete/{id}") public int deleteProduct(@PathVariable Long
	  id) { return userService.deleteUserById(id); }
	 

	@GetMapping("/productById/{id}")
	public UserMaster searchById(@PathVariable Long id) {
		return userService.findById(id);
	}

	@GetMapping("/userRole/{userRole}")
	public ResponseEntity<?> getUserByRole(@PathVariable String userRole) {
		List<UserMaster> listusers=userService.findByRoleOfUser(userRole);
		return listusers.isEmpty()?new ResponseEntity<>("Role not found!",HttpStatus.BAD_REQUEST):new ResponseEntity<>(listusers,HttpStatus.OK);
	}

	@GetMapping("/userName/{userName}")
	public List<UserMaster> getUserByName(@PathVariable String userName) {
		return userService.FindByName(userName);
	}
}
