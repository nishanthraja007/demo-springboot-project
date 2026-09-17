 package com.example;

import com.example.app.repository.StudentRepository;

public class Main {
    public static void main(String[] args) {
        StudentRepository repo = new StudentRepository();
        repo.create("Alice", 101, "CSE");
    }
}
