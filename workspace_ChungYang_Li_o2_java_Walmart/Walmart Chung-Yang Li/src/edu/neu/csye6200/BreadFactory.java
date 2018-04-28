package edu.neu.csye6200;

public class BreadFactory extends AbstractItemAPI{

	public Item getObject() {
		return new Bread();
	}
	
	public Item getObject(int price, int itemNumber) {
		return new Bread(price, itemNumber);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
