package main.java.data;

import java.time.LocalDate;

public class Student extends User {
    private String specialty;
    private int id;
    private String faculty;

    // Конструктор
    public Student(String name, LocalDate dateOfBirth, String specialty, int id, String faculty) {
        super(name, dateOfBirth);
        this.specialty = specialty;
        this.id = id;
        this.faculty = faculty;
    }

    // Геттеры и сеттеры
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}