package primitivetypes.exam;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {

        Exam exam=new Exam();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jelentkezés a vizsgára");

        System.out.println("Kérem adja meg a nevét: ");

        String name = scanner.nextLine();


        System.out.println("Kérem adja meg a születési dátumát: ");

        System.out.println("Év:");
        String yearString = scanner.nextLine();
        int year = Integer.parseInt(yearString);

        System.out.println("Hónap:");
        String monthString = scanner.nextLine();
        int month = Integer.parseInt(monthString);

        System.out.println("Nap:");
        String dayString = scanner.nextLine();
        int day = Integer.parseInt(dayString);

        LocalDate dateOfBirth=LocalDate.of(year,month,day);

        System.out.println("Adja meg az irányítószámát: ");

        String ZIPCodeString= scanner.nextLine();

        int ZIPCode=Integer.parseInt(ZIPCodeString);

        System.out.println(" Adja meg az jegyeinek átlagát: ");

        String averageString= scanner.nextLine();

        double average = Double.parseDouble(averageString);


       Person person=new Person(name,dateOfBirth,ZIPCode,average);
       exam.addPerson(person);

        System.out.println(exam.getRegisteredPersons());










    }
}
