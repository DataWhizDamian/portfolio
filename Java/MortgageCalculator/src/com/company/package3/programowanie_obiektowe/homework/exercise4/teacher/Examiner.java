package com.company.package3.programowanie_obiektowe.homework.exercise4.teacher;

import com.company.package3.programowanie_obiektowe.homework.exercise4.teacher.Exam;

public interface Examiner {
    Exam[] createExams(int numberOfStudents);
    void evaluateExam(Exam[] exams);
}
