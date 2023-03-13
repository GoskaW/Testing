package com.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Adam Kowalski", null));
        studentList.add(new Student("Janina Bąk", new Teacher("Michał Żytkowski")));
        studentList.add(new Student("Pablo Morales", null));
        studentList.add(new Student("Anstazja Pumpkin", new Teacher("Jan Kazimierz")));

        for (Student student : studentList) {
            String undefinied = getTeacherName(student);
            System.out.println("Student: " + student.getName() + ", Teacher: " + "" + undefinied);
        }
    }

    public static String getTeacherName(Student student) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String undefined = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        return undefined;
    }


}
}
