public class Book {
	
	private String name;
	private Author author;
	private double price;
	private int qtyInStock = 0;

	Book (String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	Book (String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getName() {
			return this.name;
	}
	public Author getAuthor() {
		return this.author;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return this.qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public String toString() {
		String thebook = "'" + name + "'" + " by " + author.toString();
		return thebook;
	}
	public String getAuthorName(){
		return author.getName();
	}
	public String getAuthorEmail(){
		return author.getEmail();
	}
	public char getAuthorGender(){
		return author.getGender();
	} 
}