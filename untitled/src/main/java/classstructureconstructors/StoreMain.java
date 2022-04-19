package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {
        Store store=new Store("apple");

        store.store(10);
        System.out.println(store.getProduct() + ": "+store.getStock());

        store.dispatch(5);

        store.store(21);

        System.out.println(store.getProduct() + ": " + store.getStock());
    }
}
