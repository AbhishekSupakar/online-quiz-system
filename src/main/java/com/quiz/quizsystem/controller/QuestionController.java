package com.quiz.quizsystem.controller;

import com.quiz.quizsystem.model.Question;
import com.quiz.quizsystem.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService service;

    // GET http://localhost:8080/api/questions
    @GetMapping
    public List<Question> getQuestions() {
        return service.getAllQuestions();
    }

    // POST http://localhost:8080/api/questions
    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return service.addQuestion(question);
    }

    // DELETE http://localhost:8080/api/questions/{id}
    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Integer id) {
        service.deleteQuestion(id);
    }

}
