package edu.neu.csye6200;

public class Electronics extends Item implements Comparable<Electronics>{
	
	public Electronics() {
		super(5, 10);
	}
	
	
	public Electronics(int price, int itemNumber) {
		super(price, itemNumber);// TODO Auto-generated constructor stub
	}
	
	@Override
	public void show() {
		System.out.println("Electronics: Price: " + this.getPrice() + ", ItemNumber: " + this.getItemNumber());
	}
	
	@Override
	public String toString() {
		return "Electronics: ";
	}
	
	@Override
	public int compareTo(Electronics o) {
		
		return this.getPrice() - o.getPrice();
	}

}
