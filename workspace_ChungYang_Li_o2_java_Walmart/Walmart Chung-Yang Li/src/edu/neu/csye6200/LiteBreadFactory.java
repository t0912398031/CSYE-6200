package edu.neu.csye6200;

public class LiteBreadFactory extends AbstractItemAPI{

	public Item getObject() {
		return new LiteBread();
	}
	
	public Item getObject(int price, int itemNumber, int calories) {
		return new LiteBread(price, itemNumber, calories);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
