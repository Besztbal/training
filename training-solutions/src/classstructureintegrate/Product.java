package classstructureintegrate;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increase(int amount){
        price=price+amount;
    }

    public void decrease(int amount){
        price=price-amount;
    }
}
