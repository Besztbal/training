package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {
        List<String> favouriteThings=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Kedvenc film:");
        String movie= scanner.nextLine();
        favouriteThings.add(movie);

        System.out.println("Kedvenc színész:");
        String actor= scanner.nextLine();
        favouriteThings.add(actor);

        System.out.println("Kedvenc színésznő:");
        String actress= scanner.nextLine();
        favouriteThings.add(actress);

        for (String favouriteThing : favouriteThings) {

            System.out.println(favouriteThing);
        }
    }
}
