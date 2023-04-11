/*
 * 2023-04-11
 * 최원진
 * 1차원 배열 복사
 * 
 */
package chap06;

public class CopyArrayTest {

	public static void main(String[] args) {
		int num1[] = {10,20,30};
		int num2[] = {40,50,60};
		
		num2=num1; //배열 주소 복사
		num2[2]=200; //num2[2]요소 값 변경
		
		System.out.print("num1 values:");
		for(int i:num1) { //num1출력
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.print("num2 values:");
		for(int i:num2) { //num2출력
			System.out.print(i+" ");
		}
		System.out.println();
		int num3[] = {100,200,300};
		int num4[] = {400,500,600};
		
		for(int i=0;i<num3.length;i++) {
			num4[i] = num3[i]; //배열 요소 1개씩 복사
			
		}
		
		num4[2]=999; //num4[2]요소 값 변경	
		System.out.print("num3 values:");
		for(int i:num3) { //num1출력
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.print("num4 values:");
		for(int i:num4) { //num2출력
			System.out.print(i+" ");
		}
		
		
	}

}
