package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> studentList=new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void add(Student student){
        studentList.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent){
        String studentNeptunCode = student.getNeptunCode();
        String anotherStudentNeptunCode = anotherStudent.getNeptunCode();
        String studentEducationalId = student.getEducationalId();
        String anotherStudentEducationalId = anotherStudent.getEducationalId();

        return studentNeptunCode.equals(anotherStudentNeptunCode)
                && studentEducationalId.equals(anotherStudentEducationalId);
    }
}
