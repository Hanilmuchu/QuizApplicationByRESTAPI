package com.hanil.service;

import java.util.Optional;

import com.hanil.entity.Quiz;

public interface QuestionService {
	public Optional<Quiz> getOneQuestion(int id);
}
