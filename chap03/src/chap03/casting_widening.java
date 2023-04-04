/*
 * 확대 형 변환
 * 2023.3.21
 * 최원진
 */

package chap03;

import java.util.Scanner;

public class casting_widening {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("first integer:");
		int first = stdIn.nextInt();
		
		System.out.print("second integer:");
		int second = stdIn.nextInt();
		
		double avg1 = (first+second)/2;
		double avg2 = (first+second)/2.0;
		double avg3 = (first+second)/(float)2;
		
		System.out.println("정수 연산:"+avg1);
		System.out.println("실수 연산:"+avg2);
		System.out.println("실수 연산:"+avg3);
		
		
		
	}

}
