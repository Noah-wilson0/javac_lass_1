package chap10;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa=new SupersonicAirplane();
		
		sa.takeoff();
		sa.fly();
		
		sa.flymode=SupersonicAirplane.SUPERSONIC;
		sa.fly();
		
		sa.flymode=SupersonicAirplane.NOMAL;
		sa.fly();
		
		sa.land();
		
		
		
		
		
		
		
		
		
		
		

	}

}
