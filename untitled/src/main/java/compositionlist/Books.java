package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> bookTitles=new ArrayList<>();

    public List<String> getBookTitles() {
        return bookTitles;
    }

    public void  addBook(String title){
        bookTitles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author){
        boolean isBookInList=bookTitles.contains(title);
        if (isBookInList) {
            int index = bookTitles.indexOf(title);
            String bookWithAuthor = author + bookTitles.get(index);
            bookTitles.set(index,bookWithAuthor);
        }
    }


}
