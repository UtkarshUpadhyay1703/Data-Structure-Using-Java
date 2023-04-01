package all;

public class Books {
	private int id;
	private String name;
	private int price;
	private String author;
	private static int counter;
	static {
			counter=1;
		}
	public Books() {
		this.id=counter;
		this.name="lol";
		this.price=201;
		this.author="Utkarsh";
		counter++;
	}
	public Books(String name,int price,String author) {
		this.id=counter;
		this.name=name;
		this.author=author;
		this.price=price;
		counter++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
