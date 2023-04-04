/*
 * 윤년 계산 프로그램
 * 
 * 조건1: 4로 나누어 떨어지고, 100으로 난누어 떨어지지 않으면 윤년이다.
 * 조건2: 400으로 나누어 떨어지는해도 윤영에 포함된다
 * 
 * 실행 결과
 * 년도 입력:2020
 * 윤년입니다.
 * 
 * 
 */

package chap03;
import java.util.Scanner;
public class OpEx2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = stdIn.nextInt();
		
		
//		year%4==0;
//		year%100!=0;
//		year%400==0;
		
		if(year%4==0 && year%100!=0) {
			System.out.print("윤년입니다.");
			if(year%400==0)System.out.print("윤년입니다.");
		}
		
		else			
			System.out.print("윤년이 아닙니다.");
	
		
//		실패작
//		boolean a;
//		
//		System.out.println((year/4==0) && (year/100!=0) && (year/400==0)?"윤년입니다.":"윤년이 아닙니다");
		
		
			}

}
