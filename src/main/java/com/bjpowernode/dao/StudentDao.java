package com.bjpowernode.dao;

import com.bjpowernode.entity.Student;

import java.util.List;

/**
 * @date 2021/5/6 - 13:53
 */
public interface StudentDao  {
   int  insertStudent(Student student);
    List<Student> selectStudent();
}
