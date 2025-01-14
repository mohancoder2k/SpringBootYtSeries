package com.mohan.Series2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SpringController {
	
	@PostMapping("/concat")
	public ResponseEntity<String> concatenateString(@RequestBody Message message){
		String result = message.getStr1() +  " " +message.getStr2();
		
 		return new ResponseEntity<>(result, HttpStatus.OK); 
	}
	
	// String result = str1 + str2;
	@GetMapping
	public String test() {
		return "Welcome to Second video of Spring boot series";
	}

}
