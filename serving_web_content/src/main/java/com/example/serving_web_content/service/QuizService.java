package com.example.serving_web_content.service;

import com.example.serving_web_content.model.Question;
import com.example.serving_web_content.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuestionRepository questionRepository;

//    public List<Question> getQuestionsBySubject(String subject) {
//        return questionRepository.findBySubject(subject);
//    }

    public boolean checkAnswer(Long questionId, String selectedAnswer) {
        Question q = questionRepository.findById(questionId).orElse(null);
        return q != null && q.getCorrectAnswer().equalsIgnoreCase(selectedAnswer);
    }

    public void saveQuestion(Question question) {
        questionRepository.save(question);
    }
}
