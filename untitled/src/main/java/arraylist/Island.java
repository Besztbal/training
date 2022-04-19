package arraylist;

import java.util.Arrays;
import java.util.List;

public class Island {

    public static void main(String[] args) {

        List<String> importantThings = Arrays.asList("gyufa","víz", "iránytű");

        System.out.println(importantThings);

        importantThings.set(2,"mobil");

        System.out.println(importantThings);

    }
}
