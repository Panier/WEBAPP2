/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.math.uni.springdemo.springdemo.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import pl.lodz.math.uni.springdemo.springdemo.objects.Student;

/**
 *
 * @author Student_test
 */
@Service
public class StudentService {
    ArrayList<Student> studentsList = new ArrayList<Student>();
    
    public StudentService(){
        studentsList.add(new Student(1,"Karol"));
    }
    public ArrayList<Student> findAll(){
        return studentsList;
    }
    
    public Student getStudentById(int id){
        int tmpIndex = 0;
        int iterator = 0;
        for(Student student : studentsList){
        if ( student.studentId == id){
            tmpIndex = iterator;
        }
        iterator++;
    }
        return studentsList.get(tmpIndex);
    }
    
    public Student addStudent(Student student){
         studentsList.add(student);
         return student;
    }
    
    public void deleteStudentById(int id, String name){
        int tmpIndex = 0;
        int iterator = 0;
        for(Student student : studentsList){
        if ( student.studentId == id){
            tmpIndex = iterator;
        }
        iterator++;
    }
        studentsList.remove(studentsList.get(tmpIndex));
    }
}
