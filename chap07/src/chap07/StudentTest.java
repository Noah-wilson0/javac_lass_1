/*
 * 2023-05-02
 * 최원진
 * 
 * 				
 * 
 */
package chap07;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new Student();//객체 생성
		System.out.println("s1 변수가 Student 객체 참조");
		
		Student s2=new Student();//객체 생성
		System.out.println("s2 변수가 또 다른 Student 객체 참조");
		
		//s1과 s2는 서로 다른 객체 
		//s1,s2 객체는 주소를 가지고 힙영역에 들어가면 다른 값을 참조한다
	}

}
