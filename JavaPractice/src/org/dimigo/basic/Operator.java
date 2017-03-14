/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |_Operator.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 14.
 *</pre>
 *
 * @author : kimseongsu
 * @ver : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long m = 1700000;
		long n = 3;
		long l = 1500;
		long f=m*n*12*l;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : "+String.format("%,d",m));
		System.out.println("점포 내 직원 수 : "+String.format("%,d",n));
		System.out.println("점포 수 : "+String.format("%,d",l));
		System.out.println("\n"+"연간 인건비 : "+ String.format("%,d",f));
	}
}
