package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        Dog dog = new Dog("A", 1, "brown");
        Dog dog1 = new Dog("B", 2, "grey");
        Dog dog2 = new Dog("C", 3, "black");


        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);

        System.out.println(dogs);

        Dog newDog=dogs.get(0);

        newDog.setColour("white");

        System.out.println(dogs);

        Dog otherDog=newDog;

        otherDog.setColour("pink");

        System.out.println(dogs);

        List<Dog> dogs1=dogs;

        Dog anotherDog=newDog;

        anotherDog.setColour("green");

        System.out.println(dogs1);

        dog1.setColour(null);

        System.out.println(dogs1);


    }
}
