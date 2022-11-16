package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {


        List<String> food= new ArrayList<>();
        food.add("tej");
        food.add("kenyér");
        food.add("szalámi");
        food.add("répa");
        food.add("alma");


        for (String f : food) {
            System.out.println(f);
        }

        food.remove(2);


        System.out.println(food.size());

        for (String s:food) {
            System.out.println(s);
        }
    }
}
