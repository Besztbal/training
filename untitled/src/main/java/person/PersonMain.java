package person;

public class PersonMain {

    public static void main(String[] args) {

        PersonMain personMain=new PersonMain();

        Person person=new Person("Kai","NJ123456");

        Address address=new Address("Ninjago", "Hoitsu", "Main street 56.","N-1112");

        person.moveTo(address);

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());


        Address newAddress = new Address("Magyarország", "Miskolc", "Kossuth Lajos utca 1.",  "H-3525");

        person.moveTo(newAddress);

        System.out.println(person.getAddress().addressToString());

        Person otherPerson=new Person("John Doe", "BB123568", new Address("Japan","Tokyo","Digitmo 2", "JP-1234"));

        System.out.println(otherPerson.personToString());
        System.out.println(otherPerson.getAddress().addressToString());

    }
}
