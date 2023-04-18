/*
 * 2023-04-18
 * 최원진
 * Arrays클래스와 주요 메소드
 * 클래스는 속성과 기능으로 구성
 * 메소드는 클래스의 핵심으로 클래스가 어떤 기능을 하는지 나타냄
 * 배열조작 메소드는 1차원 배열에만 적용
 */
package chap06;
import java.util.Arrays;
public class ArrayMethod {

	public static void main(String[] args) {
		int[] int1= {9,1,7,3,5,4,6,2,8,0};
		System.out.println("array:"+Arrays.toString(int1));
		
		Arrays.fill(int1, 3,5,33);
		System.out.println("after fill():"+Arrays.toString(int1));
		
		Arrays.sort(int1);
		System.out.println("after sort():"+Arrays.toString(int1));
		
		
		System.out.println("33's location is"+Arrays.binarySearch(int1,33));
		
		
		System.out.println("33's location is"+Arrays.binarySearch(int1,34));
		
		
		
		
	}

}
