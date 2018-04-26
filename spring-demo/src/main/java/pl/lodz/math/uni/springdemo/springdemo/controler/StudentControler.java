/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.math.uni.springdemo.springdemo.controler;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import pl.lodz.math.uni.springdemo.springdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.lodz.math.uni.springdemo.springdemo.objects.Student;

/**
 *
 * @author Student_test
 */
@RestController
public class StudentControler {
    
    
    
    @Autowired
    private StudentService studentService;
    
    @GetMapping("/students")
    public List<Student> getAllStudets() {
        return studentService.findAll();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int studentId) {
        return studentService.getStudentById(studentId);
    }

   // @GetMapping("/students/search/{name}")
  //  public Student getStudent(@PathVariable("name") String name) {
   //     return studentService.findStudentByName(name);
//}
    
    @PostMapping("/students")
    public Student insert(@RequestBody Student student) {
        return studentService.addStudent(student);
}
    
}
