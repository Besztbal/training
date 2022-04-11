package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person person = new Person("John Doe", 37);

        Person otherPerson = person;

        otherPerson.setName("Jack Doe");

        System.out.println(person.getName());
        System.out.println(otherPerson.getName());

        int a = 24;
        int b = a;

        b++;

        System.out.println(a);
        System.out.println(b);

        otherPerson=new Person("Jane Doe",27);

        System.out.println(person.getName() + " " + person.getAge());
        System.out.println(otherPerson.getName() + " " + otherPerson.getAge());
        // A két változóban más-más érték van, mert az otherPerson változóban lecserélődött a referencia, így már két külön objektumra mutatnak.


    }


}
