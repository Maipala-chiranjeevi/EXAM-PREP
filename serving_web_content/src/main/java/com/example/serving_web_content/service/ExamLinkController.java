package com.example.serving_web_content.service;

import com.example.serving_web_content.model.ExamLink;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Controller
public class ExamLinkController {

    @GetMapping("/exam/{examName}")
    public String getExamDetails(@PathVariable String examName, Model model) {
        try {
            InputStream inputStream = new ClassPathResource("exams.json").getInputStream();
            ObjectMapper mapper = new ObjectMapper();
            List<ExamLink> exams = Arrays.asList(mapper.readValue(inputStream, ExamLink[].class));

            for (ExamLink exam : exams) {
                if (exam.getExam().equalsIgnoreCase(examName)) {
                    model.addAttribute("exam", exam);
                    return "exam-details"; // Name of Thymeleaf template without extension
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/dashboard";
    }
}
