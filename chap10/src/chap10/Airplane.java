/*
 * public final class Airplane 이렇게 final이 붙어있으면 상속 안됨
 */
package chap10;

public class Airplane {
	public void land() {
		System.out.println("landing");
	}
	public void fly() {
		System.out.println("nomal flight");
	}
	public void takeoff() {
		System.out.println("take-off");
	}
	
	
}
