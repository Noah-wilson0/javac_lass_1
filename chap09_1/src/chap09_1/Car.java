package chap09_1;

public class Car {
	
	int speed;
	void run() {
		System.out.println(speed+"으로 달린다.");
	}
	public static void main(String[] args) {
//		speed=60;//불가능 정적메소드(static) 안에서 인스턴스 필드는 객체 생성 후 사용
		
		Car myCar=new Car();
		
		myCar.speed=60;
		myCar.run();
		

	}

}
