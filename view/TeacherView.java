package main.java.view;

import main.java.data.Teacher;

public class TeacherView {
    public void displayTeacherData(Teacher teacher) {
        // Вывод данных учителя в консоль
        System.out.println("Teacher Details:");
        System.out.println("Name: " + teacher.getName());
        System.out.println("Date of Birth: " + teacher.getDateOfBirth());
        System.out.println("ID: " + teacher.getId());
        System.out.println("Subject: " + teacher.getSubject());
    }
}
