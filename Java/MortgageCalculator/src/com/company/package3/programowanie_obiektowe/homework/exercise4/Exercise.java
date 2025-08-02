package com.company.package3.programowanie_obiektowe.homework.exercise4;

import com.company.package3.programowanie_obiektowe.homework.exercise4.student.Examinated;
import com.company.package3.programowanie_obiektowe.homework.exercise4.student.Student;
import com.company.package3.programowanie_obiektowe.homework.exercise4.teacher.Exam;
import com.company.package3.programowanie_obiektowe.homework.exercise4.teacher.Examiner;
import com.company.package3.programowanie_obiektowe.homework.exercise4.teacher.Teacher;

public class Exercise {
/*
Napisz program, który odwzoruje relacje jakie mogą występować na uczelni między studentem, nauczycielem i egzaminem z pytaniami.
Najpierw egzamin jest tworzony przez nauczyciela, który tworzy
np. 5 pytań, o jakiejś treści i 3 odpowiedziach, z czego tylko jedna jest poprawna.
Każde pytanie ma zapisaną poprawną odpowiedź i to ustala nauczyciel.
Tylko nauczyciel może tę wartość odczytać (enkapsulacja).
Następnie nauczyciel rozdaje taki egzamin swoim trzem studentom i każdy z nich odpowiada na pytania
(podczas tworzenia studenta zdefiniuj, na które pytanie jak odpowie
lub poszukaj w internecie jak wylosować wartość z podanego przedziału).

Po udzieleniu odpowiedzi, studenci przekazują pytania do nauczyciela, który egzaminy sprawdza i ocenia razem z określeniem
kto jaką dostał ocenę.
Zapewnij, aby student nie mógł odwołać się do informacji, których nie powinien zobaczyć
(tzn. nie mógł dostać się do wartości, która odpowiedź w danym pytaniu jest poprawna).
Napisz to tak, aby klasa studenta oraz klasa nauczyciela mogły współdzielić te same cechy
(pokazywałem mechanizmy jak to osiągnąć).
Zdefiniuj również interfejsy Examinated oraz Examiner, w których będzie określone, co muszą być w stanie zrobić
egzaminator (np. stworzyć egzamin, albo dokonać jego oceny) oraz osoba egzaminowana (np. napisać egazamin).
Do każdego kroku dodaj drukowanie na ekranie, co w danym momencie programu się dzieje, przykładowo tak jak poniżej:


Creating teacher: Nauczyciel Nauczycielski
Creating student: Rafał Rafalski
Creating student: Roman Romański
Creating student: Michał Michalski

Teacher created 3 exams
Student: Rafał Rafalski answering question: 1st Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 3rd answer, index:[2]
Student: Rafał Rafalski answering question: 2nd Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 1st answer, index:[0]
Student: Rafał Rafalski answering question: 3rd Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 3rd answer, index:[2]
Student: Rafał Rafalski answering question: 4th Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 2nd answer, index:[1]
Student: Rafał Rafalski answering question: 5th Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 2nd answer, index:[1]
Student: Roman Romański answering question: 1st Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 2nd answer, index:[1]
Student: Roman Romański answering question: 2nd Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 1st answer, index:[0]
Student: Roman Romański answering question: 3rd Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 2nd answer, index:[1]
Student: Roman Romański answering question: 4th Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 3rd answer, index:[2]
Student: Roman Romański answering question: 5th Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 1st answer, index:[0]
Student: Michał Michalski answering question: 1st Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 2nd answer, index:[1]
Student: Michał Michalski answering question: 2nd Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 3rd answer, index:[2]
Student: Michał Michalski answering question: 3rd Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 1st answer, index:[0]
Student: Michał Michalski answering question: 4th Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 2nd answer, index:[1]
Student: Michał Michalski answering question: 5th Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 3rd answer, index:[2]

Teacher evaluating Student: Rafał Rafalski exam
Question: 1, content: 1st Question content!, goodAnswerIndex: 1, givenAnswerIndex: 2
Question: 2, content: 2nd Question content!, goodAnswerIndex: 2, givenAnswerIndex: 0
Question: 3, content: 3rd Question content!, goodAnswerIndex: 0, givenAnswerIndex: 2
Question: 4, content: 4th Question content!, goodAnswerIndex: 1, givenAnswerIndex: 1
Question: 5, content: 5th Question content!, goodAnswerIndex: 0, givenAnswerIndex: 1
Student: Rafał Rafalski points scored: 1

Teacher evaluating Student: Roman Romański exam
Question: 1, content: 1st Question content!, goodAnswerIndex: 1, givenAnswerIndex: 1
Question: 2, content: 2nd Question content!, goodAnswerIndex: 2, givenAnswerIndex: 0
Question: 3, content: 3rd Question content!, goodAnswerIndex: 0, givenAnswerIndex: 1
Question: 4, content: 4th Question content!, goodAnswerIndex: 1, givenAnswerIndex: 2
Question: 5, content: 5th Question content!, goodAnswerIndex: 0, givenAnswerIndex: 0
Student: Roman Romański points scored: 2

Teacher evaluating Student: Michał Michalski exam
Question: 1, content: 1st Question content!, goodAnswerIndex: 1, givenAnswerIndex: 1
Question: 2, content: 2nd Question content!, goodAnswerIndex: 2, givenAnswerIndex: 2
Question: 3, content: 3rd Question content!, goodAnswerIndex: 0, givenAnswerIndex: 0
Question: 4, content: 4th Question content!, goodAnswerIndex: 1, givenAnswerIndex: 1
Question: 5, content: 5th Question content!, goodAnswerIndex: 0, givenAnswerIndex: 2
Student: Michał Michalski points scored: 4
 */
    public static void main(String[] args) {
        exercise4();
    }

    private static void exercise4() {
        Examiner teacher = new Teacher("Nauczyciel", "Nauczycielski");
        Examinated[] students = new Student[]{
                new Student("Rafał", "Rafalski"),
                new Student("Roman", "Romański"),
                new Student("Łukasz", "Daniel")
        };
        System.out.println();

        Exam[] exams = teacher.createExams(students.length);
        for (int i = 0; i < students.length; i++) {
            students[i].writeExam(exams[i]);
        }
        System.out.println();

        teacher.evaluateExam(exams);

    }

}
