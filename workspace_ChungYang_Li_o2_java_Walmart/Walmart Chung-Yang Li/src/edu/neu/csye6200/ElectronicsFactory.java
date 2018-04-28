package edu.neu.csye6200;

public class ElectronicsFactory extends AbstractItemAPI{

	public Item getObject(int price, int itemNumber) {
		return new Electronics(price, itemNumber);
	}
	
	public Item getObject() {
		return new Electronics();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
