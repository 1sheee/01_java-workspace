package com.br.chop01_poly.model.vo;

public class Desktop extends Electronic{

	public static final String CPU = "intel"; // 굵은줄은 static, 전부대문자는 상수
	private String graphic;
	
	
	
	public Desktop() {}

	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}

	public String getGraphic() {
		return graphic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}

	public static String getCpu() {
		return CPU;
	}

	@Override
	public String toString() {
		return super.toString() + "Desktop [ + graphic=" + graphic + "]" + ", cpu : " + CPU;
	}
	
	
	
}
