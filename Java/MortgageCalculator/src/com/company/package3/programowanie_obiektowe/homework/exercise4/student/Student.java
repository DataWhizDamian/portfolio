package com.company.package3.programowanie_obiektowe.homework.exercise4.student;

import com.company.package3.programowanie_obiektowe.homework.exercise4.Person;
import com.company.package3.programowanie_obiektowe.homework.exercise4.Question;
import com.company.package3.programowanie_obiektowe.homework.exercise4.teacher.Exam;

import java.util.Random;

public class Student extends Person implements Examinated {
    public Student(final String name,final String surname) {
        super(name, surname);
        System.out.println("Creating Student: " + name + " " + surname);
    }

    @Override
    public void writeExam(final Exam exam) {
        exam.setOwner(this);

        Random random = new Random();
        Question[] questions = exam.getQuestions();
        for (Question question : questions) {
            int randomAnswerIndex = random.nextInt(question.getPossibleAnswersSize());
            System.out.println("Student: " + getName() + " " + getSurname() + ", answering question: " + question.getContent() + ", possible answers: " + question.getPossibleAnswers() + ", answered: " + question.getPossibleAnswer(randomAnswerIndex) + ", index:[" + randomAnswerIndex + "]" );

            question.answer(randomAnswerIndex);
        }

    }

    @Override
    public String toString() {
        return "Student: " + getName() + " " + getSurname();
    }
}
