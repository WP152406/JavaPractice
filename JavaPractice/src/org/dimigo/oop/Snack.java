/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_Snack.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 *</pre>
 *
 * @author : kimseongsu
 * @ver : 1.0
 */
public class Snack {

	private String name;
	private String company;
	private int price;
	private int number;
	
	
	
	/**
	 * @param name
	 * @param company
	 * @param price
	 * @param number
	 */
	
	public Snack(){
		
	}
	
	public Snack(String name, String company, int price, int number) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int calcPrice(){
		return price*number;
	}
	
	public String toString(){
		return "이름 : "+name+"\n"+"제조사 : "+company+"\n"+"가격 : "+price+"\n"+"개수 : "+number+"\n";
	}
}
