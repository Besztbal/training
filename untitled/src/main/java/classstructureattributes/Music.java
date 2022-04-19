package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Song song=new Song();
        System.out.println("Előadó: ");
        song.band=scanner.nextLine();
        System.out.println("Cím: ");
        song.title=scanner.nextLine();
        System.out.println("Hossz: ");
        song.length= scanner.nextDouble();

        System.out.println("Előadó: "+song.band);
        System.out.println("Cím: "+song.title +" ("+ song.length+" perc)");

    }
}
