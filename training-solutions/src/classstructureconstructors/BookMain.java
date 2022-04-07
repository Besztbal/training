package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book=new Book("Én","Me");

        book.register("12345");

        System.out.println(book);


    }
}
