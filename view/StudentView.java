package main.java.view;

import main.java.data.Student;

public class StudentView {
    public void displayStudentData(Student student) {
        // Вывод данных студента в консоль
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Date of Birth: " + student.getDateOfBirth());
        System.out.println("Specialty: " + student.getSpecialty());
        System.out.println("ID: " + student.getId());
        System.out.println("Faculty: " + student.getFaculty());
    }
}
