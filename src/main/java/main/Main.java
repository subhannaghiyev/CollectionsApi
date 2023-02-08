/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bean.Student;
import bean.Teacher;

import java.util.HashMap;
import java.util.*;


/**
 * @author subhan
 */
public class Main {
   static int sum=0;

    public static void main(String[] args) {
        /*
        TreeMap Sorts differently than HasMap, but HasMap does not
         */

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                     sum+=arr[i][j];
                }
            }





        Map<Teacher, Student> students = new TreeMap<>();
        Teacher teacher = new Teacher(1,"Subhan","Naghiyev");
        Teacher teacher1 = new Teacher(2,"Hasan","Naghiyev");
        Teacher teacher2 = new Teacher(3,"Xanlar","Isayev");

        students.put(teacher,new Student(1,"Camal","Naghizade"));
        students.put(teacher1,new Student(2,"Sebuter","Gasimov"));
        students.put(teacher2,new Student(3,"Mustafa","Gasimov"));

        System.out.println(students.keySet());
        System.out.println(students.values());


        }
//        System.out.println("Sum "  + sum);
    }
}
