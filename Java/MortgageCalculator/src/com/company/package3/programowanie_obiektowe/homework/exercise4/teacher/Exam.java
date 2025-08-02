package com.company.package3.programowanie_obiektowe.homework.exercise4.teacher;

import com.company.package3.programowanie_obiektowe.homework.exercise4.student.Examinated;
import com.company.package3.programowanie_obiektowe.homework.exercise4.Question;

public class Exam {
    private final Question[] questions;
    private int pointsScored;
    private Examinated owner;


    public Exam(int size) {
        this.questions = new Question[size];
    }

    public Question[] getQuestions() {
        return questions;
    }

    Examinated getOwner() {
        return owner;
    }

    public int getPointsScored() {
        return pointsScored;
    }

    public void setOwner(final Examinated owner) {
        this.owner = owner;
    }

    void addQuestion(Question question) {
        int nextAvailable = -1;
        for (int i = 0; i < this.questions.length; i++) {
            if (this.questions[i] == null) {
                nextAvailable = i;
                break;
            }
        }
        if (nextAvailable == -1) {
            System.out.println("Too many questions added");
        } else {
            this.questions[nextAvailable] = question;
        }
    }

    void calculatePoints() {
        int points = 0;
        for (Question question : questions) {
            if (question.isCorrectlyAnswered()) {
                points++;
            }
        }
        this.pointsScored = points;
    }
}
