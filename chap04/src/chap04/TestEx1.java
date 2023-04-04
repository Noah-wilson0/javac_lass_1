/*
 * 2023.03.28
 * 최원진
 * 직급과 나이를 입력받아서 직급이 7 또는 8이고, 나이가 40대면 "연급80%"
 * 직급이 5 또는 6이고 나이가 50대면 "연급100%"
 * 그 외의 경우 "연급 대상자 아님"
 * 을 출력하는 프로그램
 */
package chap04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("input position : ");
		int position = stdin.nextInt();
		
		System.out.print("input age : ");
		int age = stdin.nextInt();
		
		if((position>=7 && position<=8) && (age>=40 && age<50))
			System.out.print("연금 80%");
		else if((position>=5 && position<=6) && (age>=50 && age<60))
			System.out.print("연금 100%");
		else System.out.println("연금 대상자 아님");

		
	}

}
