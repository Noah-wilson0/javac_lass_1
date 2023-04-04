/**
 * 2023.04.04
 * 두 숫자를 입력 받아서 두 수 사이의 합계 출력하기
 * #문제 분석
 * -변수:first, second, total
 * #알고리즘
 * 1.정수 입력(first, second)
 * 2.선택문(if (first<second))
 * 3.반복문(for (first; second; first++)
 * 				total+=first 
 * 
 * 
 */
package chap05;
import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		int j=0;
		int total=0;
		int mask=0;
		Scanner stdin = new Scanner(System.in);
		System.out.print("first number :");
		int first = stdin.nextInt();
		
		System.out.print("second number :");
		int second = stdin.nextInt();
		
		if(first>second) {
			mask=first;
			first=second;
			second=mask;
		}
		
		if(first<second) {
			for(j=first; j<=second;j++) {
				total+=j;
			}
			
		}
		System.out.println("first부터second까지의합:"+total);
		
		
	}

}
