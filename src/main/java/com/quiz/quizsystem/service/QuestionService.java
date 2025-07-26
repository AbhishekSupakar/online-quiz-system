package com.quiz.quizsystem.service;

import com.quiz.quizsystem.model.Question;
import java.util.List;

public interface QuestionService {
    List<Question> getAllQuestions();
    Question addQuestion(Question question);
    void deleteQuestion(Integer id);
}
