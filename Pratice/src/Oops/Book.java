package Oops;

public class Book {
	String title;
	String author;
	double price;
	
	public Book(String title, String author, double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("Title   : "+title);
		System.out.println("Author  : "+author);
		System.out.println("Price   : "+price);
	}
	
	public static void main(String[] args) {
		Book b1=new Book("Clean Code","Robert Martin",450.0);
		b1.displayDetails();
		System.out.println();
		Book b2 = new Book("Effective Java","Joshua Bloch",500);
		b2.displayDetails();
		
	}
	
}
