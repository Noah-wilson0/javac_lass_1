/*
 * 시프트 연산자
 * 2023.3.21
 * 최원진
 */package chap03;

import java.util.Scanner;

public class ShiftEx {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter two numbers:");
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		System.out.println("a="+a+"("+Integer.toBinaryString(a)+")");
		System.out.println("a="+a+"("+Integer.toBinaryString(b)+")");
		
		System.out.println("a<<2="+(a<<2)+"("+Integer.toBinaryString(a<<2)+")");
		System.out.println("a>>2="+(a>>2)+"("+Integer.toBinaryString(a>>2)+")");
		
		System.out.println("b<<2="+(a<<2)+"("+Integer.toBinaryString(b<<2)+")");
		System.out.println("b>>2="+(a>>2)+"("+Integer.toBinaryString(b>>2)+")");
	}
}
