/*
 * 2023.03.28
 * 최원진
 * 두개의 숫자를 입력받아서 두 숫자 사이의 홀수값을 모두 더해서 출력하기
 * #문제 분석
 * 변수-num1,num2,sum
 * #알고리즘
 * 1.정수 입력(num1,num2,sum)
 * 2.선택문(if(num1<num2))
 * 3.복합논리(반복문 안에 선택문 포함)
 * 		while(num1<=num2){
 * 			if(num1%2==1){
 * 				sum=sum+num1
 * 			}
 * 			num1=num1+1
 * 		{
 */
package chap05;
import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("first number : ");
		int num1 = stdin.nextInt();
		
		System.out.print("second number : ");
		int num2 = stdin.nextInt();
		int mask=0;
		if(num1>num2) {
			mask=num1;
			num1=num2;
			num2=mask;
		}
		
		int i,sum=0;
		for(i=num1+1;i<=num2;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}