package com.test.questions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.questions.model.Test;
import com.test.questions.repository.TestRepo;

@RestController
@RequestMapping("/admin")
public class TestQuestionController {

	@Autowired
	private TestRepo repo;
	
	@PostMapping("/save")
	public ResponseEntity<String>saveData(@RequestBody Test test){
		repo.save(test);
		return ResponseEntity.ok("Done");
		
	}
}
