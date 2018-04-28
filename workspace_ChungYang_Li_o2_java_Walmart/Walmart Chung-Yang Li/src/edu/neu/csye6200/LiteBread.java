package edu.neu.csye6200;

public class LiteBread extends Bread{
	
	public LiteBread() {
		
	}
	
	public LiteBread(int price, int itemNumber, int calories) {
		super(price, itemNumber, calories);// TODO Auto-generated constructor stub
	}
	
	@Override
	public void show() {
		System.out.println("LiteBread: Price: " + this.getPrice() + ", ItemNumber: " + 
				this.getItemNumber() + ", Calories: " + this.getCalories());
	}
	
	@Override
	public String toString() {
		return "LiteBread: " + "Price: " + this.getPrice() + ", ItemNumber: " + this.getItemNumber() + ", Calories: " + this.getCalories();
	}
	@Override
	public int compareTo(Bread o) {
		// TODO Auto-generated method stub
		return this.getCalories() - o.getCalories();
	}
}
