package com.golearntolead.git.service;

import com.golearntolead.git.entity.Student;
import com.golearntolead.git.exception.StudentNotFoundException;
import com.golearntolead.git.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    private List<Student> STUDENTS = studentRepository.studentDB();


    public List<Student> getAllStudentDetails() {
        return STUDENTS;
    }

    public Student getStudentById(long id) {
        Student resultedStudent = STUDENTS
                                        .stream()
                                        .filter(student -> student.getStudentId() == id)
                                        .findFirst()
                                        .orElseThrow(() -> new StudentNotFoundException("There are no students available with this id"));
        return resultedStudent;
    }

    public Student saveStudent(Student student) {
        STUDENTS.add(student);
        return student;
    }

    public String deleteById(long id) {
        STUDENTS.removeIf(student -> student.getStudentId() == id);
        return "STUDENT WITH ID "+id+" HAS BEEN DELETED";
    }
}
