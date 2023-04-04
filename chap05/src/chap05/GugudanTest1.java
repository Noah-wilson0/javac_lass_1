/*
 * 2023.03.28
 * 최원진
 * 입력받은 단의 구구단 출력하기
 */
package chap05;
import java.util.Scanner;
public class GugudanTest1 {

	public static void main(String[] args) {
		int num,i=1;
		Scanner stdin = new Scanner(System.in);
		System.out.print("단을 입력:");
		num = stdin.nextInt();
		while(i<10)
		{
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}
		
	}

}
