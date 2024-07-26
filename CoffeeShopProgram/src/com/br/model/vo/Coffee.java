package com.br.model.vo;

import java.util.Objects;

public class Coffee implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String coffeeName;
	private int coffeePrice;
	
	public Coffee() {}

	public Coffee(String coffeeName, int coffeePrice) {
		super();
		this.coffeeName = coffeeName;
		this.coffeePrice = coffeePrice;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public int getCoffeePrice() {
		return coffeePrice;
	}

	public void setCoffeePrice(int coffeePrice) {
		this.coffeePrice = coffeePrice;
	}

	@Override
	public String toString() {
		return coffeeName + "\t" + coffeePrice + "원";
	}

	@Override
	public int hashCode() {
		return Objects.hash(coffeeName, coffeePrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		return Objects.equals(coffeeName, other.coffeeName) && coffeePrice == other.coffeePrice;
	}
	
}
