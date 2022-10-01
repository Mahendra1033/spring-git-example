package com.golearntolead.git.repository;

import com.golearntolead.git.entity.Student;
import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepository {

    public List<Student> studentDB() {
        return Arrays.asList(new Student(101, "Jean", "A"),
                            new Student(101, "Paul", "B"),
                            new Student(103, "Duminy", "C"));
    }
}
