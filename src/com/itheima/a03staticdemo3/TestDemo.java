package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student stu1 = new Student("张三", 18, "男");
        Student stu2 = new Student("李四", 21, "女");
        Student stu3 = new Student("王五", 20, "男");

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        int age = StudentUtil.getMaxAgeStudent(students);
        System.out.println(age);
    }
}
