package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {

    public static void main(String[] args) {


        Prefix pre = new Prefix("Mr.");
        FirstName first = new FirstName("Balazs");
        LastName last = new LastName("Besztercei");

        String prefix = pre.getPre();
        String firstName = first.getFirst();
        String lastName = last.getLast();

        String wholeName = prefix + " " + firstName + " " + lastName;

        System.out.println(wholeName);

        System.out.println(pre.getPre() + " " + first.getFirst() + " " + last.getLast());
    }
}
