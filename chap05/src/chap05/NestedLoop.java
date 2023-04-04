/*
 * 2023-04-04
 * 최원진
 * 입력받은 숫자만큼 줄수를 반복하면서 직각삼각형 출력
 *#문제분석
 * -변수 :num,i,j
 * #알고리즘
 * 1.줄수 입력(num)
 * 2중첩 반복
 * 		while(i<=num){
 * 			while(j<=i){
 * 				별찍기
 * 			}
 * 			
 * 		}
 */
package chap05;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("input number:");
		int num = stdin.nextInt();
		
		int i=1;
		while(i<=num)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
