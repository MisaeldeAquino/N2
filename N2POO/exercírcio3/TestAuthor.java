import java.util.Scanner;

public class TestAuthor {
	public static void main(String [] args) {

		Author anAuthor = new Author("C.S. Lewis", "Cslewis@gmail.com", 'f');

		System.out.println("Author: " + anAuthor.getName());
		System.out.println("Email: " + anAuthor.getEmail());
		anAuthor.setEmail("Cslewis@gmail.com");
		System.out.println("Gender: " + anAuthor.getGender());
		System.out.println("Author info: " + anAuthor.toString());
	}
}