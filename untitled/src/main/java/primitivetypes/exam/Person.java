package primitivetypes.exam;

import java.time.LocalDate;

public class Person {

    private String name;

    private LocalDate dateOfBirth;

    private int ZIPCode;

    private double averageOfGrades;

    public Person() {
    }

    public Person(String name, LocalDate dateOfBirth, int ZIPCode, double averageOfGrades) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.ZIPCode = ZIPCode;
        this.averageOfGrades = averageOfGrades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setZIPCode(int ZIPCode) {
        this.ZIPCode = ZIPCode;
    }

    public void setAverageOfGrades(double averageOfGrades) {
        this.averageOfGrades = averageOfGrades;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getZIPCode() {
        return ZIPCode;
    }

    public double getAverageOfGrades() {
        return averageOfGrades;
    }

    @Override
    public String toString() {
        return
            "name: " + name + "\n"+
            "dateOfBirth: " + dateOfBirth + "\n"+
            "ZIPCode: " + ZIPCode + "\n"+
            "averageOfGrades: " + averageOfGrades;
    }
}
