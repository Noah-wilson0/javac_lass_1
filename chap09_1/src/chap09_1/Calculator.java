/*
 * 정적 멤버 아용 (static)
 */
package chap09_1;

public class Calculator {
	static double pi=3.1459;
	int field1;
	
//	static void Method() {
//		this.field1=10;
//	}
	
	
	static int plus(int x,int y) { //정적 메소드 , static 한정자
		
		return x+y;
	}
	
	
	static int minus(int x,int y) { //정적 매소드, static한정자
		return x-y;
	}
	
	
}
