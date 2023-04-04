/*
 * 2023-04-04
 * 최원진
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이 되면 1000을 넘은 수와 평균을 출력
 *
 */
package chap05;
import java.util.Scanner;
public class BreakTest {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int sum=0,i=1;
		while(true)
		{
			System.out.print("숫자 입력");
			int num = stdin.nextInt();
			sum+=num;
			if(sum>=1000) {
				break;	
			}
			i++;
		}	
		System.out.println("합은 :"+sum);
		System.out.println("평균은 :"+sum/i);
		
		
	}

}
