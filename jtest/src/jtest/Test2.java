package jtest;
abstract class arithmetic{
	abstract void operation();
	abstract void input(int x,int y);
}
class add extends arithmetic{
	void operation() {
		System.out.println("add");
	}
	void input(int x,int y) {
		System.out.println("더하기+"+(x+y));
	}
}

class sub extends arithmetic{
	void operation() {
		System.out.println("sub");
	}
	void input(int x,int y) {
		System.out.println("빼기:"+(x-y));
	}
}
class mul extends arithmetic{
	void operation() {
		System.out.println("mul");
	}
	void input(int x,int y) {
		System.out.println("곱하기:"+(x*y));
	}
}
class div extends arithmetic{
	void operation() {
		System.out.println("div");
	}
	void input(int x,int y) {
		System.out.println("나누기:"+(x/y));
	}
}

public class Test2 {

	public static void main(String[] args) {
		 
		
		arithmetic a=new add();
		a.operation();
		a.input(5, 5);
		
		arithmetic b=new sub();
		b.operation();
		b.input(5, 5);
		
		arithmetic c=new mul();
		c.operation();
		c.input(5, 5);
		
		arithmetic d=new div();
		d.operation();
		d.input(5, 5);
		
		

	}

}