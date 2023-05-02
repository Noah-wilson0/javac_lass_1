 /*
 * 2023-05-02
 * 최원진
 * 
 * 				
 * 
 */
package chap08;

public class Car1 {
	String company="쉐보레"; //null
	String model; //null
	String color; //null
	int maxSpeed; //0
	
	//생성자1
	public Car1(){
		
	}
	//생성자2
	public Car1(String model){
		this.model=model;
	}
	
	//생성자3
	public Car1(String model,String color){
		this.model=model;
		this.color=color;
	}
	//생성자4
	public Car1(String model,String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	
}
