/*
 * 2023-04-18
 * 최원진
 * 삼각형 패턴4
 * k<=(num-i)/2
 */
package star;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("input number");
		int num = stdin.nextInt();
		int i=1;
		int line=(num*2)-1;
		while(i<=line) {
			int j=1;
			//
			int k=1;
			while(k<=(line-i)/2) {
				System.out.print(" ");
				k++;
				
			}
			//
			if(i%2!=0) {
				while(j<=i) {
					System.out.print("*");
					j++;
			}
			}
			else System.out.println();
			i++;
		}

	}

}
