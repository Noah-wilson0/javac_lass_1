/*
 * 2023-05-02
 * 최원진
 * 
 * 				
 * 
 */
package chap08;

public class Car {
	//필드 
	//같은 패키지(▦chap08이렇게 생긴것)안에서사용 가능
	//초기화 하지 않는 경우 묵시적 초기화
	String company="현대"; //String 값 지정 x -> null로 초기화
	String model="그랜저";
	String color="검정";
	int maxSpeed=350;
	int speed;//int 값 지정x -> 0으로 초기화
}
