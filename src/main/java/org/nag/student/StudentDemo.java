package org.nag.student;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDemo {
    public static void main(String[] args) {

        List<Student> studentDatabase =  StudentDatabase.getStudents();

        List<Student> a = studentDatabase.stream().filter(s -> s.getDepartment().equals("A")).collect(Collectors.toList());
System.out.println(a);

    }
}
