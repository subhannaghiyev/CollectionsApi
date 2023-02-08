package main;

import bean.Student;
import bean.Teacher;

import java.util.HashMap;


public class MapExample {
    public static void main(String[] args) {
        /*
        HashMap buckets work by means of...
         If the hashCodes are together, equals can be both together and not together. At this time, they fall into the same bucket
         However, if equals are together, hashCodes must be together without it.
         We don't override the equals method with our hashCode, it's not a convention, but we don't ask how to override it
         It's a convention.
         Even without Overriding any of them in the first turn, the question may arise, why don't we Override the equals method?
         Because the Objects of the Class we give may not be together as a reference, but perhaps the Parameter (value)
         are together with each other. Accordingly, we have to Override the equals method, and then we override the equals method
         what should we do next hashCode Override if the parameters we give in our equals method handle hashCode
         should be overridden so that the hashCode is caph 1 time. Otherwise, it will be challenged 2 times, and here we are Convention
         i'm broken...
         */
        HashMap<Teacher, Student> students = new HashMap<>();
        Teacher teacher = new Teacher(1,"Subhan","Naghiyev");
        Teacher teacher1 = new Teacher(2,"Hasan","Naghiyev");

        students.put(teacher,new Student(1,"Camal","Naghizade"));
        students.put(teacher1,new Student(2,"Sebuter","Qasimov"));

        System.out.println(students);
        students.get(teacher);


        /*
        I wrote to show the difference from TreeMap...

        Map<Teacher, Student> students = new HashMap<>();
        Teacher teacher = new Teacher(1,"Subhan","Naghiyev");
        Teacher teacher1 = new Teacher(2,"Hasan","Naghiyev");
        Teacher teacher2 = new Teacher(3,"Xanlar","Isayev");

        students.put(teacher,new Student(1,"Camal","Naghizade"));
        students.put(teacher1,new Student(2,"Sebuter","Gasimov"));
        students.put(teacher2,new Student(3,"Mustafa","Gasimov"));

        System.out.println(students.keySet());
        System.out.println(students.values());
         */


        /*
        TreeMap Sorts differently than HasMap, but HasMap does not

        Map<Teacher, Student> students = new TreeMap<>();
        Teacher teacher = new Teacher(1,"Subhan","Naghiyev");
        Teacher teacher1 = new Teacher(2,"Hasan","Naghiyev");
        Teacher teacher2 = new Teacher(3,"Xanlar","Isayev");

        students.put(teacher,new Student(1,"Camal","Naghizade"));
        students.put(teacher1,new Student(2,"Sebuter","Gasimov"));
        students.put(teacher2,new Student(3,"Mustafa","Gasimov"));

        System.out.println(students.keySet());
        System.out.println(students.values());
         */





//        String s1 = "FB";
//        String s2 = "Ea";
//
//        System.out.println(s1.hashCode()+" "+s2.hashCode());
//
//        HashMap<String,Integer> map = new HashMap<>();
//
//        map.put(s1,1);
//        map.put(s2,2);
    }
}
