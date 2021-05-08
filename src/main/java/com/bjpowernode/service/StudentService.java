package com.bjpowernode.service;

import com.bjpowernode.entity.Student;

import java.util.List;

/**
 * @date 2021/5/6 - 14:36
 */
public interface StudentService {
   int  addStudent(Student student);
   List<Student> queryStudent();
}
