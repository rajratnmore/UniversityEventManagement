package com.geekster.UniversityEventManagement.service;

import com.geekster.UniversityEventManagement.model.Department;
import com.geekster.UniversityEventManagement.model.Student;
import com.geekster.UniversityEventManagement.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;
    private com.geekster.UniversityEventManagement.model.Student Student;

    public String addStudent(Student newStudent) {
        studentRepo.save(newStudent);
        return "new student added";
    }

    public String updateStudentDepartmentById(Integer studentId, Department studentDepartment) {

        Student student = studentRepo.findById(studentId).orElse(Student);
        student.setStudentDepartment(studentDepartment);
        studentRepo.save(student);
        return "Student updated";
    }

    public String deleteStudent(Integer studentId) {
        studentRepo.deleteById(studentId);
        return "student deleted successfully";
    }

    public List<Student> getAllStudent() {
        return (List<Student>) studentRepo.findAll();
    }

    public Student getStudent(Integer studentId) {
        return studentRepo.findById(studentId).orElse(Student);
    }
}
