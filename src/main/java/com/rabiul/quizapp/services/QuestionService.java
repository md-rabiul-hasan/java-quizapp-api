package com.rabiul.quizapp.services;

import com.rabiul.quizapp.dao.QuestionDao;
import com.rabiul.quizapp.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestion(){
        return  questionDao.findAll();
    }
}
