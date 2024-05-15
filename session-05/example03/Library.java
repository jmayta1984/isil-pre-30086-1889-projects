package example03;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public int booksQuantity() {
        return books.size();
    }

    public void showBooks() {
        for (int i = 0; i <= booksQuantity() - 1; i++) {
            Book book = books.get(i);
            System.out.println(book.getTitle());
        }
    }

}
