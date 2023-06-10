package OOPS;
import java.util.*;
class Book {
	String title;
	String author;
	String ISBN;
	static ArrayList<Book> books = new ArrayList<Book>();

	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	public String getTitle() {
	    return title;
	}
	public String getAuthor() {
	    return author;
	}
	public String getISBN() {
	    return ISBN;
	}
	public static void addBook(Book book) {
		books.add(book);
	}
	public static void removeBook(int n) {
		books.remove(n);
	}

	public static ArrayList<Book> getBooks() {
		return books;
	}
}

public class library {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of books: ");
		int n = sc.nextInt();
		int i;
		Book bookn;
		for(i = 0; i < n; i++) {
			System.out.println("Enter the title of book " + (i + 1) + " : ");
			String title = sc.next();
			System.out.println("Enter the author of book " + (i + 1) + " : ");
			String author = sc.next();
			System.out.println("Enter the ISBN code of book " + (i + 1) + " : ");
			String isbn = sc.next();
			bookn = new Book(title, author, isbn);
			Book.addBook(bookn);
		}
		ArrayList<Book> books = Book.getBooks();
		System.out.println("List of books: ");
		for (Book book: books) {
			System.out.println("The ISBN code of " + book.getTitle() + " written by " + book.getAuthor() + ": " + book.getISBN());
		}
		System.out.println();
		System.out.println("Enter the book number to be removed: ");
		int val = sc.nextInt();
		val--;
		Book str = books.get(val);
		Book.removeBook(val);
		System.out.println("\nAfter removing " + str.getTitle() + ":");
		for (Book book: books) {
			System.out.println("The ISBN code of " + book.getTitle() + " written by " + book.getAuthor() + ": " + book.getISBN());
		}
	}
}


