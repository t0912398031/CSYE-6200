package edu.neu.csye6200;

public class Item extends AbstractItemAPI {
	private int price;
	private int itemNumber;
	
	public Item(int price, int itemNumber) {
		this.price = price;
		this.itemNumber = itemNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	@Override
	public void show() {
		System.out.println("Price: " + this.price + ", ItemNumber: " + this.itemNumber);// TODO Auto-generated method stub
		
	}
	

}
