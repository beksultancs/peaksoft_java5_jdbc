package org.example;

import org.example.models.Student;
import org.example.repositories.StudentRepository;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws SQLException {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.createTable();

        Student dilbara = new Student("Dilbara", (byte) 19);
        Student dinara = new Student("Dinara", (byte) 18);

        studentRepository.save(dilbara);
        studentRepository.save(dinara);

        studentRepository.findAll().forEach(System.out::println);

    }
}
