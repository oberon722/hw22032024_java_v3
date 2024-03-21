package main.java.data;

import java.time.LocalDate;

public class Teacher extends User {
    private final int id; // Поле id остается без изменений ок
    private final String subject; // Сделаем поле subject final

    // Конструктор
    public Teacher(String name, LocalDate dateOfBirth, int id, String subject) {
        super(name, dateOfBirth);
        this.id = id;
        this.subject = subject;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }
}