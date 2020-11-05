import java.util.Scanner;

public class TestBook {
	public static void main(String[] args) {

		Author anAuthor = new Author("Misael M de aquino", "misaelmiltondeaquino@gmail.com", 'M');
		Book book1 = new Book("A vida é bela", anAuthor, 35.00, 850);
		Book book2 = new Book("Existe vida após engenharia?", anAuthor, 31.00);

		System.out.println("Book: " + book1.toString());
		System.out.println("Price: " + book1.getPrice());
		System.out.println("In Stock: " + book1.getQtyInStock());

		book1.setPrice(20.00);
		book1.setQtyInStock(300);

		System.out.println("New Price: " + book1.getPrice());
		System.out.println("New Stock: " + book1.getQtyInStock());

		System.out.println("Author: " + book1.getAuthor().getName() + "\nEmail: " + book1.getAuthor().getEmail());

		System.out.println("**********************");

		System.out.println("Book: " + book2.toString());
		System.out.println("Price: " + book2.getPrice());

		book2.setPrice(25.00);

		System.out.println("New Price: " + book2.getPrice());
		System.out.println("Author: " + book2.getAuthor().getName() + "\nEmail: " + book2.getAuthor().getEmail());

	}
}