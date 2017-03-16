/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *    |_Loop.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author : kimseongsu
 * @ver : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		int att=100;
		String[] ch = {"마법사", "기사", "영주", "농민"};
		int num;
		
		do{
			System.out.println("--------------------");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("--------------------");
			System.out.println("메뉴 입력 => "); 
			choice = scanner.nextInt();
			
			switch(choice){
			case 1:
				att+=10;
				System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n", att);
				break;
			case 2:
				att-=10;
				System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n", att);
				break;
			case 3:
				num = new Random().nextInt(4);
				System.out.println(ch[num]);
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				break;
			default :
				System.out.println("없는 메뉴입니다!!");
			}
		}while(choice!=9);
	}

}
