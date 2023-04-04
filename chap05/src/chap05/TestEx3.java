/*
 * 2023.03.28
 * 최원진
 * 1~1000까지의 정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램
 * for로 작성
 */
package chap05;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = stdin.nextInt();
		int i,sum=0;
		for(i=1;i<=1000;i++)
		{
			if(i%num==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
