package com.quiz.quizsystem.repository;

import com.quiz.quizsystem.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
