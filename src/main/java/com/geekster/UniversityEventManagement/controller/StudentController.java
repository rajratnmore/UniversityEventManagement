package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Department;
import com.geekster.UniversityEventManagement.model.Student;
import com.geekster.UniversityEventManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student newStudent){
        return studentService.addStudent(newStudent);
    }

    @PutMapping("student/studentId/{studentId}/department/{studentDepartment}")
    public String updateStudentDepartmentById(@PathVariable Integer studentId, @PathVariable Department studentDepartment){
        return studentService.updateStudentDepartmentById(studentId, studentDepartment);
    }

    @DeleteMapping("student/studentId/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId){
        return studentService.deleteStudent(studentId);
    }

    @GetMapping("students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();

    }

    @GetMapping("student/{studentId}")
    public Student getStudent(@PathVariable Integer studentId){
        return studentService.getStudent(studentId);
    }

}
