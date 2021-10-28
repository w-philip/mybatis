package com.bjpowernode.test;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.impl.StudentServiceImpl;
import com.bjpowernode.util.ServiceFactory;

public class test {
    public static void main(String[] args) {
        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());

        Student s = ss.getById("1001");
        System.out.println(s);
    }
}
