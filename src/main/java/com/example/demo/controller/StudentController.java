package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    public void index(){

    }

    @GetMapping("/show")
    public List<Student> findAllStudent(){
        //todo
        return studentService.findAllStudent();
    }

    @PostMapping("save_student")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    public String saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Student " + student.getName() + " successfully saved!";
    }

    @GetMapping("/{email}")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    public Student findByEmail(@PathVariable String email){
        return studentService.findByEmail(email);
    }

    @PutMapping("update_student")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    public void deleteStudent(@PathVariable String email){
        studentService.deleteStudent(email);
    }

    @GetMapping("/welcome")
    public ModelAndView welcome(){
        return new ModelAndView("welcome");
    }
}
