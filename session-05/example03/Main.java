package example03;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Conversación en la Catedral", "Novela", 90.0, "Mario Vargas Llosa"));

        library.addBook(new Book("100 años de soledad", "Novela",   100, "Gabriel Garcia Marquez"));

        library.showBooks();
    }
}
