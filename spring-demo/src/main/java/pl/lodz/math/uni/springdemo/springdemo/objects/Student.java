/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.math.uni.springdemo.springdemo.objects;

/**
 *
 * @author Student_test
 */
public class Student {
    public int studentId;
    public String studentName;
    
    public Student(){
    }
    
    public Student(int id,String name){
        studentId = id;
        studentName = name;
    }
    
    @Override
    public String toString() {
        return String.format("Student [id=%s, name=%s", studentId, studentName);
    }
}
