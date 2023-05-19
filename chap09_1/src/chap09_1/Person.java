/*
 * final 필드 선언 초기화
 */
package chap09_1;

public class Person {
	
	final String nation="korea"; //선언과 초기화 동시에함
	final String ssn;
	String name;
	
	//생성자
	public Person(String ssn,String name) {
		this.ssn=ssn;
		this.name=name;
	}
	
}
