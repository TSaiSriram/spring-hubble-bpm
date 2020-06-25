 package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller1 {
@Autowired
	
	rep1 us;
	
	
	@PostMapping("/insert")
	public String insert(@RequestBody Model i) {
		return us.adding(i);
	}

}
