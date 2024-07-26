package com.br.model.vo;

import java.util.Objects;

public class Bread implements java.io.Serializable { // 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String breadName;
	private int breadPrice;
	
	public Bread() {}

	public Bread(String breadName, int breadPrice) {
		super();
		this.breadName = breadName;
		this.breadPrice = breadPrice;
	}

	public String getBreadName() {
		return breadName;
	}

	public void setBreadName(String breadName) {
		this.breadName = breadName;
	}

	public int getBreadPrice() {
		return breadPrice;
	}

	public void setBreadPrice(int breadPrice) {
		this.breadPrice = breadPrice;
	}

	@Override
	public String toString() {
		return breadName + "\t" + breadPrice + "원";
	}

	@Override
	public int hashCode() {
		return Objects.hash(breadName, breadPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bread other = (Bread) obj;
		return Objects.equals(breadName, other.breadName) && breadPrice == other.breadPrice;
	}
	
}
