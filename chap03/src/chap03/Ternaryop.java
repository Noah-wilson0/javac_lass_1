/*
 * 3항 연산
 * 2023.3.21
 * 최원진
 */
package chap03;

import java.util.Scanner;

public class Ternaryop {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter two numbers:");
		int a = stdIn.nextInt();
		
		boolean flag;
		flag=(a%2==0)?true:false;
		System.out.println(a+"이 짝수인가?");
		System.out.println(flag);
		
		
	}
}
