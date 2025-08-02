package com.company.package3.programowanie_obiektowe.homework.exercise4.teacher;

import com.company.package3.programowanie_obiektowe.homework.exercise4.Person;
import com.company.package3.programowanie_obiektowe.homework.exercise4.Question;
import com.company.package3.programowanie_obiektowe.homework.exercise4.teacher.Exam;
import com.company.package3.programowanie_obiektowe.homework.exercise4.teacher.Examiner;

public class Teacher extends Person implements Examiner {

    public Teacher(final String name, final String surname) {
        super(name, surname);
        System.out.println("Creating teacher: " + name + " " + surname);
    }

    public Exam[] createExams(int numberOfStudents) {
        Exam[] exams = new Exam[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            exams[i] = createExam();
        }
        System.out.println("Teacher created: " + numberOfStudents + " exams");
        return exams;
    }


    private Exam createExam() {
        Exam exam = new Exam(5);
        exam.addQuestion(new Question(1,"1st Question content!", new String[]{"1st answer", "2st answer", "3st answer"}, 1));
        exam.addQuestion(new Question(2,"2st Question content!", new String[]{"1st answer", "2st answer", "3st answer"}, 2));
        exam.addQuestion(new Question(3,"3st Question content!", new String[]{"1st answer", "2st answer", "3st answer"}, 0));
        exam.addQuestion(new Question(4,"4st Question content!", new String[]{"1st answer", "2st answer", "3st answer"}, 1));
        exam.addQuestion(new Question(5,"5st Question content!", new String[]{"1st answer", "2st answer", "3st answer"}, 0));
        return exam;
    }

    public void evaluateExam(Exam[] exams) {
        for (Exam exam : exams) {
            System.out.println("Teacher evaluating " + exam.getOwner() + " exam");
            exam.calculatePoints();
            System.out.println(exam.getOwner().toString() + " points scored: " + exam.getPointsScored());
            System.out.println();
        }
    }

}
