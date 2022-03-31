package com.mydb.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mydb.boot.domain.User;
import com.mydb.boot.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping(value = "/insert", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.ALL_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.ALL_VALUE })
	public String insert(@ModelAttribute User user) {
		if (userService.insertOne(user)) {
			return "Success!!";
		} else {
			return "Failed...";
		}
	}

	@GetMapping("/selectAll")
	public List<User> selectAll() {
		return userService.selectAll();
	}

	@PostMapping("/update")
	public String update(@ModelAttribute User user) {
		if (userService.updateOne(user)) {
			return "Update Success!!";
		} else {
			return "update Failed...";
		}
	}

	@PostMapping("/delete/{id:.+}")
	public String delete(@PathVariable("id") Integer userId) {
		if (userService.deleteOne(userId)) {
			return "Update Success!!";
		} else {
			return "update Failed...";
		}
	}

	@GetMapping("/select/{id:[0-9]+}")
	public User find(@PathVariable("id") Integer userId) {
		return userService.findOne(userId);

	}

}
