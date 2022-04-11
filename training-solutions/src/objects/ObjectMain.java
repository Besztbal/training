package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectMain {

    public static void main(String[] args) {

        new Book();

        System.out.println(new Book());

        Book emptyBook=new Book();

        emptyBook=null;

        System.out.println(emptyBook);

        Book book=new Book();


        Book anotherBook=new Book();

        System.out.println(book==anotherBook);

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;

        Book[] books={book1,book2,book3};

        List<Book> bookList1= Arrays.asList(book1,book2,book3);

        List<Book> bookList=new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        System.out.println(Arrays.toString(books));

        System.out.println(bookList);


    }
}
