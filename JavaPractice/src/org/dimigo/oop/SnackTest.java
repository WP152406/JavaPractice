/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_SnackTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 7.
 *</pre>
 *
 * @author : kimseongsu
 * @ver : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snack[] snackArr = new Snack[3];
		snackArr[0]= new Snack("새우깡","농심",1100,2);
		snackArr[1]= new Snack("콘칲","크라운",1200,1);
		snackArr[2]= new Snack("허니버터칩","해태",1500,4);
		int sum=0;
		
		for(int i=0 ; i<3 ; i++){
			System.out.println(snackArr[i].toString());
			sum+=snackArr[i].calcPrice();
		}
		System.out.println("총 구매 금액 : " + sum);
	}
}
