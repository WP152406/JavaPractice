/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |_PrimitiveDataType.java
 *
 * 1. 개요 : 아이유 프로필 출력하
 * 2. 작성일 : 2017. 3. 9.
 *</pre>
 *
 * @author : kimseongsu
 * @ver : 1.0
 */
public class PrimitiveDataType {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		boolean isMale = false;
		int age=25;
		double height= 161.8;
		float weight= 44.3f;
		char bloodType='A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : " + name);
		System.out.println(isMale ? "성별 : 남" : "성별 : 여");
		System.out.println("나이 : " +  age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("혈액형 : "+ bloodType);
	
	}

}
