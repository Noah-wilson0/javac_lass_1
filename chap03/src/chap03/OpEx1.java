/*
 * 동전 교환 프로그램
 * 입력된 액수만큼 500원,100원,50원,10원짜리 동전으로 교환해 주는 프로그램 작성
 * 조건1: 동전의 총 개수를 최소화
 * 조건2: 고액의 동전 우선 교환
 * 
 * 2023.3.21
 * 최원진
 */
package chap03;
import java.util.Scanner;

public class OpEx1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Cash input:");
		int cash = stdIn.nextInt();
		
		int cash1=cash/500;
		int cash2=(cash%500)/100;
		int cash3=((cash%500)%100)/50;
		int cash4=(((cash%500)%100)%50)/10;
		
		System.out.println("500원:"+cash1);
		System.out.println("100원:"+cash2);
		System.out.println("50원:"+cash3);
		System.out.println("10원:"+cash4);
		
		
		
		
	}
}
