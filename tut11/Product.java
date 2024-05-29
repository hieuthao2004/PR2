package tut11.product;

import java.io.Serializable;

public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private double price;
	
	public Product(String name,double price) throws Exception{
		if (!isValidName(name)) {
			throw new Exception("The name is invalid");
		}
		if (!isValidPrice(price)) {
			throw new Exception("The price is invalid");
		}
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	private boolean isValidName(String name) {
		return name != null && !name.isEmpty() && name.matches("^[a-zA-Z]*$") && name.trim().length() <=20;
	}
	private boolean isValidPrice(Double price) {
		return price >= 0;
	}
}	
