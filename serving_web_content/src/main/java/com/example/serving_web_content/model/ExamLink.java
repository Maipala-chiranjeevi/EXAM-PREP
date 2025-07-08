package com.example.serving_web_content.model;

import java.util.List;
import java.util.Map;

public class ExamLink {
    private String exam;
    private String registrationStart;
    private String lastDate;
    private String examDates;
    private List<String> syllabus;
    private List<String> pdfLinks;
    private List<String> videoConcepts;
    private List<String> videoLinks;
    private String quizLink;

    // Getters and setters
    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getRegistrationStart() {
        return registrationStart;
    }

    public void setRegistrationStart(String registrationStart) {
        this.registrationStart = registrationStart;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getExamDates() {
        return examDates;
    }

    public void setExamDates(String examDates) {
        this.examDates = examDates;
    }

    public List<String> getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(List<String> syllabus) {
        this.syllabus = syllabus;
    }

    public List<String> getPdfLinks() {
        return pdfLinks;
    }

    public void setPdfLinks(List<String> pdfLinks) {
        this.pdfLinks = pdfLinks;
    }

    public List<String> getVideoConcepts() {
        return videoConcepts;
    }

    public void setVideoConcepts(List<String> videoConcepts) {
        this.videoConcepts = videoConcepts;
    }

    public List<String> getVideoLinks() {
        return videoLinks;
    }

    public void setVideoLinks(List<String> videoLinks) {
        this.videoLinks = videoLinks;
    }

    public String getQuizLink() {
        return quizLink;
    }

    public void setQuizLink(String quizLink) {
        this.quizLink = quizLink;
    }
}