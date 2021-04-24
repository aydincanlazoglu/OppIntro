package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("BEN ÇALIÞTIM");
	}
	
	public Product(int id,String name, double unitPrice, String detail)  {
		this();
		this.name = name;
		this.id = id;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
