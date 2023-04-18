/*
 * 2023-04-18
 * 최원진
 * 삼각형 패턴3
 */
package star;
import java.util.Scanner;
public class Star3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("input number");
		int num = stdin.nextInt();
		int i=1;
		
		while(i<=num) {
			int j=1;
			int k=1;
			
			while(k<=num-i) {
				System.out.print(" ");
				k++;
				
			}
			while(j<=i) {
				
				System.out.print("*");
				j+=1;
			}
			System.out.println();
			i+=1;
		}
		}
	}


