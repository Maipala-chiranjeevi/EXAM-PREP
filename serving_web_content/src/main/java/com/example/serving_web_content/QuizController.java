package com.example.serving_web_content;

import com.example.serving_web_content.model.Question;
import com.example.serving_web_content.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/{subject}")
    public String showQuizBySubject(@PathVariable String subject, Model model) {
        List<Question> questions = questionRepository.findBySubjectIgnoreCase(subject);
        model.addAttribute("questions", questions);
        model.addAttribute("subject", subject);
        return "quiz";
    }

    @PostMapping("/submit/{subject}")
    public String submitQuiz(@PathVariable String subject,
                             @RequestParam Map<String, String> answers,
                             Model model) {
        int score = 0;
        int total = 0;

        for (Map.Entry<String, String> entry : answers.entrySet()) {
            try {
                Long questionId = Long.parseLong(entry.getKey().replace("answers[", "").replace("]", ""));
                Question question = questionRepository.findById(questionId).orElse(null);
                if (question != null) {
                    String correctOption = question.getCorrectAnswer().toLowerCase().trim();
                    String correctValue = switch (correctOption) {
                        case "optiona" -> question.getOptionA();
                        case "optionb" -> question.getOptionB();
                        case "optionc" -> question.getOptionC();
                        case "optiond" -> question.getOptionD();
                        default -> "";
                    };

                    String submittedAnswer = entry.getValue().trim();
                    if (submittedAnswer.equalsIgnoreCase(correctValue)) {
                        score++;
                    }
                }
                total++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        model.addAttribute("score", score);
        model.addAttribute("total", total);
        model.addAttribute("subject", subject);
        return "result";
    }
}
