package com.bjpowernode.service;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.entity.Student;

import java.util.List;

/**
 * @date 2021/5/6 - 14:38
 */
public class StudentServiceImp implements StudentService{
     private StudentDao stuDao;

    public void setStuDao(StudentDao stuDao) {
        this.stuDao = stuDao;
    }

    @Override
    public int addStudent(Student student) {
       int num =stuDao.insertStudent(student);
       return num;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> list =stuDao.selectStudent();
        return list;
    }
}
