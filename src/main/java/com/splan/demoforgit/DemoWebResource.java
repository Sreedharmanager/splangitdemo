package com.splan.demoforgit;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoWebResource {

	@GetMapping("/getMessage/{name}")
	public ResponseEntity<?> getMessage(@PathVariable("name") String name) {
		return new ResponseEntity<>(" HI WELCOME " + name, HttpStatus.OK);

	}

}
