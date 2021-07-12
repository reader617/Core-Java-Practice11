package exercise2;

public class Invoice {
	private String partNumber;
	private String description;
	private int quantity;
	private Double pricePerItem;
	
	public Invoice(String partNumber, String description, int quantity, Double pricePerItem) {
		this.partNumber = partNumber;
		this.description = description;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(Double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	@Override
	public String toString() {
		return "Invoice [partNumber=" + partNumber + ", description=" + description + ", quantity=" + quantity
				+ ", pricePerItem=" + pricePerItem + "]";
	}
	
	
}
