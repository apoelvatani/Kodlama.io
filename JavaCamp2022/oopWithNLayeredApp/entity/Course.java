package oopWithNLayeredApp.entity;

public class Course extends Object{
	private double unitPrice;
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	@Override
	public String getKind() {
		// TODO Auto-generated method stub
		return "Kurs";
	}
}
