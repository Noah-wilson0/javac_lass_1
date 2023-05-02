/*
 * 2023-05-02
 * 최원진
 * 
 * 				
 * 
 */
package chap07;

public class PlusMinusTest {

	public static void main(String[] args) {
		PlusMinus ob1 = new PlusMinus(); //PlusMinus 클래로스로부터 객체 생성
		
		String ssum, sminus; //return값이 plus(int)하나가 아니기 떄문 int 선언시 plus만 출력됨 , 두 수의 합은 > 출력이 안됨
		
		ssum=ob1.plus(50, 30); //PlusMinus class의 plus 메소드 호출
		sminus=ob1.minus(50, 30); //PlusMinus class의 minus 메소드 호출
		
		System.out.println(ssum);
		System.out.println(sminus);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
