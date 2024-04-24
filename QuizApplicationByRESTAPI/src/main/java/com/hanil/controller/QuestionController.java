package com.hanil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hanil.entity.Quiz;
import com.hanil.service.QuestionServiceImp;

@RestController
public class QuestionController {
	@Autowired
	QuestionServiceImp service;
	
	@GetMapping("/getquestions")
	public List<Quiz> getAllQuestions()
	{
		return service.getAllQuestions();
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addQuestion(@RequestBody Quiz quiz)
	{
		return service.addQuestion(quiz);
	}
	@DeleteMapping("/remove/{sno}")
	public String remove(@PathVariable int sno)
	{
		return service.removeQuestion(sno);
	}
}
