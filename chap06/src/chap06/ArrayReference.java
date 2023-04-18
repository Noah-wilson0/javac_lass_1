/*
 * 2023-04-18
 * 최원진
 * 객체 참조 배열
 * 참조타입(클래스,인터페이스) 배열은 각 항목에 객체의 번지를 가짐
 * String은 클래스이므로
 * String[] 배열은 각 항목에 문자열이 아닌, String 객체의 번지를 가짐
 * String[]배열간 문자 비교는 ==연산자 대신 equals()메소드 사용
 */
package chap06;

public class ArrayReference {

	public static void main(String[] args) {
		String[] strArray=new String[3];
		strArray[0]="java";
		strArray[1]="java";
		strArray[2]= new String("java");
		
		System.out.println(strArray[0]==strArray[1]); //주소가 같음
		System.out.println(strArray[0]==strArray[2]); //주소가 다름
		System.out.println(strArray[0].equals(strArray[2])); //같은걸 가리키는가? true
		//자바에서 문자열이 같을떄는 다른 언어와는 다르게 "==" 말고 equals메소드 사용
	}

}
