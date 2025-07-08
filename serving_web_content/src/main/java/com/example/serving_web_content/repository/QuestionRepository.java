package com.example.serving_web_content.repository;

import com.example.serving_web_content.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
//    List<Question> findBySubject(String subject);
    List<Question> findBySubjectIgnoreCase(String subject);

}
