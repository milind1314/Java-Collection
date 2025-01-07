package jan_07.comparable_Interface;

public class Product implements Comparable<Product> {

	private Integer productNumber;
	private String ProductName;
	private Double ProductPrice;
	
	public Product(Integer productNumber, String productName, Double productPrice) {
		super();
		this.productNumber = productNumber;
		this.ProductName = productName;
		this.ProductPrice = productPrice;
	}

	@Override
	public int compareTo(Product p) {
		return this.ProductName.compareTo(p.ProductName);
	}

	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", ProductName=" + ProductName + ", ProductPrice="
				+ ProductPrice + "]";
	}
	
}
