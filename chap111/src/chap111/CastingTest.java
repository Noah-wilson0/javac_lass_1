package chap111;

 class Parent{
	 public void method1() {
		 System.out.println("Parent-mothod1");
	 }
	 public void method2() {
		 System.out.println("Parent-mothod2");
	 }
	 
 }
 
 class Child extends Parent{
	 @Override
	 public void method2() {
		 System.out.println("Child-mothod2");
	 }
	 public void method3() {
		 System.out.println("Child-mothod3");
	 }
	 
	 
 }
 
 
public class CastingTest {

	public static void main(String[] args) {
		Child child=new Child();
		
		Parent parent=child; //자동 타입 변환(upcasting)
		parent.method1();
		parent.method2(); //재정의된 메소드 호출
		//parent.method3(); //호출 불가능
		
		
		
		
		
		
		
		
		
		
		
		

	}

}