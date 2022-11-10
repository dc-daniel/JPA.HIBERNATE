package com.API.JPA.HIBERNATE.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API.JPA.HIBERNATE.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "Maria","4499111114", "maria@gmail.com", "1245");
		return ResponseEntity.ok().body(u);
		
	}

}
