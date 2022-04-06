package JAVA8_features.studentsort;

import java.util.*;

public class StudentMain  {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Jack",10));
        students.add(new Student("Sparrow",20));
        students.add(new Student("Ma",15));
        students.add(new Student("Ba",151));

        //System.out.println(students);
//students.stream().sorted(Comparator.naturalOrder(students)).
     // students.stream().sorted(Comparator.comparing(Student::getSname).reversed()).forEach(System.out::println);

    //  students.forEach(System.out::println);
//Collections.sort(students,);
        students.stream().map(Student::getMarks).forEach(System.out::println);
    }
}
