/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_Car.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 *</pre>
 *
 * @author : kimseongsu
 * @ver : 1.0
 */
public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	
	public Car2(){

	}
	
	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice){
		this.company=newCompany;
		this.model=newModel;
		this.color=newColor;
		this.maxSpeed=newMaxSpeed;
		this.price=newPrice;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setCompany(String company) {
		this.company=company;
	}
	
	public void setModel(String model){
		this.model=model;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed=maxSpeed;
	}

	public void setPrice(int price) {
		this.price=price;
	}

}
