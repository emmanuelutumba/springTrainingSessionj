package com.creasmit.trainingSession.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creasmit.trainingSession.model.User;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	List<User> users = new ArrayList<User>();

	@GetMapping
	public ResponseEntity getList() {
		users.add(new User("TOMBO", "Emmanuel"));
		users.add(new User("MONKILA", "JO"));
		users.add(new User("MECHACK", "MUTOKA"));
		users.add(new User("JM", "KAB"));

		return ResponseEntity.ok(users);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity getById(@PathVariable("id") int id) {

		System.out.println("id: " + id);

		
		users.add(new User("TOMBO", "Emmanuel"));
		users.add(new User("MONKILA", "JO"));
		users.add(new User("MECHACK", "MUTOKA"));
		return ResponseEntity.ok(users);
	}
	
	@PostMapping
	public ResponseEntity save(@RequestBody User user) {
		users.add(user);
		return ResponseEntity.ok(user);
	}
}
