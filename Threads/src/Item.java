package edu.neu.csye6200;

import edu.neu.csye6200.api.AbstractItemAPI;

public class Item extends AbstractItemAPI implements Comparable<Item> {
//	private Integer id;
//	private String name;
//	private Double price;
	public Integer id;
	public String name;
	public Double price;

	public Item() {
		super();
		init (1, "item", 1.0);
	}

	public Item(Integer id, String name, Double price) {
		super();
		init(id, name, price);
	}

	public void init(Integer id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String info() {
		StringBuilder sb = new StringBuilder();
		sb.append("[").append(id.toString()).append("] ")
		.append(" $").append(price.toString())
		.append(" ").append(name);
		return sb.toString();
	}

	@Override
	public Integer getIntegerKey() {
		return 1;
	}
	
	@Override
	public Double getDoubleKey() {
		return 1.0;
	}

	@Override
	public String getStringKey() {
		return "";
	}

	/**
	 * Implementation of Comparable interface
	 * Sort by price (from low price to highest price)
	 */
	@Override
	public int compareTo(Item o) {
		return this.getPrice().compareTo(o.getPrice());  // lo to hi
	}
	
	@Override
	public String toString() {
		return "Item " + this.info();
	}

}
