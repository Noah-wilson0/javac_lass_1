/*
 * 2023-04-18
 * 최원진
 * 삼각형 패턴1
 */
package star;
import java.util.Scanner;
public class Star1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("input number");
		int num = stdin.nextInt();
		int i=1;
		
		while(num>=i) {
			int j=1;
			while(j<=num) {
				System.out.print("*");
				j+=1;
			}
			System.out.println();
			num-=1;
			
		}
	}

}