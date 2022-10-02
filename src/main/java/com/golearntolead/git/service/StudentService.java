package com.golearntolead.git.service;

import com.golearntolead.git.entity.Student;
import com.golearntolead.git.exception.StudentNotFoundException;
import com.golearntolead.git.repository.StudentRepository;
import com.golearntolead.git.response.ResponseData;

import java.util.List;

public class StudentService {


     StudentRepository studentRepository = new StudentRepository();

     List<Student> STUDENTS = studentRepository.studentDB();


    public List<ResponseData> getAllStudentDetails() {
        ResponseData responseData = new ResponseData();
        for(int i=0; i<STUDENTS.size(); i++) {
            responseData.setStudentId(STUDENTS.get(i).getStudentId());
            responseData.setStudentRank(STUDENTS.get(i).getStudentRank());
            responseData.setStudentName(STUDENTS.get(i).getStudentName());
        }
        return (List<ResponseData>) responseData;
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
