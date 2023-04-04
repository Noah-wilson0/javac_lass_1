/**
 * 2023.03.14
 * 세 개의 값을 입력 받아 첫 번째 값은 문장려, 두 번쨰 값은 정수값
 * 세 번쨰값은 실수로 출력하는 프로그램
 * @author WJ CHOI
 */
package chap02;

import java.util.Scanner;
public class Keyboardinput {

	public static void main(String[] args) {
		java.util.Scanner stdIn = new Scanner(System.in);
		System.out.print("이름과 나이, 몸무게를 공간(space)으로 구분하여 입력:");
		String name = stdIn.next();//이름을 문자열로 입력
		int i = stdIn.nextInt();
		double d = stdIn.nextDouble();
		System.out.println(name+"씨의 나이는 "+i+"세이고 ");
		System.out.println("몸무게는"+d+"KG 입니다.");

	}

}
