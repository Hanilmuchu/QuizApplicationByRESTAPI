package com.hanil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.hanil.entity.Quiz;
import com.hanil.repo.QuestionRepo;

@Service
public class QuestionServiceImp {
	@Autowired
	private QuestionRepo repo;
	public List<Quiz> getAllQuestions()
	{
		return repo.findAll();
	}
	public ResponseEntity<String> addQuestion(Quiz quiz) {
		repo.save(quiz);
		return new ResponseEntity<>("success",HttpStatus.CREATED) ;
	}
	public String removeQuestion(int sno) {
		repo.deleteById(sno);
		return "Deleted...";
	}
	
	
}
