package SarPayLawKaBookStore;

public class book {
	private String Type;
	private String Title;
	private String Author;
	private double Price;
	private int TotalPages;
	private int Quantity;

	public book() {
		super();
	}

	public book(String Type, String Title, String Author, double Price, int TotalPages, int Quantity) {
		super();
		this.Type = Type;
		this.Title = Title;
		this.Author = Author;
		this.Price = Price;
		this.TotalPages = TotalPages;
		this.Quantity = Quantity;

	}

	public String getType() {
		return Type;
	}

	public String getTitle() {
		return Title;
	}

	public String getAuthor() {
		return Author;
	}

	public double getPrice() {
		return Price;
	}

	public int getTotalPages() {
		return TotalPages;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setType(String Type) {
		this.Type = Type;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public void setAuthor(String Author) {
		this.Author = Author;
	}

	public void setPrice(double Price) {
		this.Price = Price;
	}

	public void setTotalPages(int TotalPages) {
		this.TotalPages = TotalPages;
	}

	public void setQuantity(int Quantity) {
		this.Quantity = Quantity;
	}

}
