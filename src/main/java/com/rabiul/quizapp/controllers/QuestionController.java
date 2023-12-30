package com.rabiul.quizapp.controllers;

import com.rabiul.quizapp.models.Question;
import com.rabiul.quizapp.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("all-question")
    public List<Question> getAllQuestion(){
        return questionService.getAllQuestion();
    }
}
