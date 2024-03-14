/* Write a program that first reads book information from the user. The details to be asked for each book include the title,
the number of pages and the publication year. Entering an empty string as the name of the book ends the reading process.
After this the user is asked for what is to be printed. If the user inputs "everything", all the details are printed:
the book titles, the numbers of pages and the publication years. However, if the user enters the string "name", only the
book titles are printed. It is probably worthwhile to implement a class called Book to represent a book. */

import java.util.*;

class Book {
	String title;
	int numberOfPages, publicationYear;

	public Book() {
	}

	// Constructor to initialize the book details
	public Book(String title, int numberOfPages, int publicationYear) {
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.publicationYear = publicationYear;
	}

	// Getter method for the title
	public String getTitle() {
		return title;
	}

	// Getter method for the number of pages
	public int getNumberOfPages() {
		return numberOfPages;
	}

	// Getter method for the publication year
	public int getPublicationYear() {
		return publicationYear;
	}
}

class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;

		// Reading book information from the user
		System.out.println("Enter book information. Enter an empty string as the title to end the process.");

		// Creating a Book object to store the details
		Book book = new Book();
		String title;
		int numberOfPages, publicationYear;
		do {
			System.out.print("Title: ");
			title = scanner.nextLine();

			// Break the loop if an empty string is entered as the title
			if (title.isEmpty()) {
				break;
			}

			System.out.print("Number of pages: ");
			numberOfPages = Integer.parseInt(scanner.nextLine());

			System.out.print("Publication year: ");
			publicationYear = Integer.parseInt(scanner.nextLine());

			// Creating a Book object with the entered details
			book = new Book(title, numberOfPages, publicationYear);

		} while (true);

		// Asking the user what to print
		System.out.print("What to print (\"everything\" or \"name\"): ");
		input = scanner.nextLine();

		if (input.equalsIgnoreCase("everything")) {
			System.out.println("Printing everything:");
			System.out.println("Printing book titles: " + book.getTitle());
			System.out.println("Printing book pages: " + book.getNumberOfPages());
			System.out.println("Printing book publication year: " + book.getPublicationYear());

		} else if (input.equalsIgnoreCase("name")) {
			System.out.println("Printing book titles: " + book.getTitle());
		} else {
			System.out.println("Invalid input. Please enter \"everything\" or \"name\".");
		}

		scanner.close();
	}
}
