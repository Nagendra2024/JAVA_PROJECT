package org.nag.student;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

    public static List<Student> getStudents() {
       Student s1 = new Student(1,"babu","A",39);
       Student s2 = new Student(2,"raju","B",50);
       Student s3 = new Student(3,"sudha","C",32);
       Student s4 = new Student(4,"siddhu","A",60);
       return Arrays.asList(s1,s2,s3,s4);

    }

}
