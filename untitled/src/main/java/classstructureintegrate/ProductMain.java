package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a termék nevét:");
        String name = scanner.nextLine();

        System.out.println("Add meg a termék árát:");
        int price = scanner.nextInt();

        Product product = new Product(name, price);
        System.out.println(product.getName() + " " + product.getPrice());

        product.increase(20);
        System.out.println(product.getName() + " " + product.getPrice());

        product.decrease(10);
        System.out.println(product.getName() + " " + product.getPrice());
    }
}
