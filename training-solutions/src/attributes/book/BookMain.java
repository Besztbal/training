package attributes.book;

public class BookMain {

    public static void main(String[] args) {

        Book book=new Book("A szél árnyékában");

        System.out.println(book.getTitle());

        book.setTitle("A tavasz fogságában");


    }
}
