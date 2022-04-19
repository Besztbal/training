package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student = new Student("Béla");
        Student student2 = new Student("Jane");
        Student student3 = new Student("John");

        students.add(student);
        students.add(student2);
        students.add(student3);

        student3.setActive(false);

        System.out.println(students.size());

        List<Student> studentsToRemove = new ArrayList<>();
        for (Student s : students) {
            if (!s.isActive()) {
                studentsToRemove.add(s);
            }
        }

        students.removeAll(studentsToRemove);

        System.out.println(students.size());
    }
}
