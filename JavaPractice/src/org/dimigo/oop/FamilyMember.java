/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_FamilyMember.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 *</pre>
 *
 * @author : kimseongsu
 * @ver : 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;

	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}

	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt(){
		System.out.println("가족 총 인원 수 : "+memberCnt);
	}
	
}
