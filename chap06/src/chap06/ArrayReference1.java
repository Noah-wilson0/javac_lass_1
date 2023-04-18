/*
 * 2023-04-18
 * 최원진
 * null과NullPointException
 * 참조변수의 == 연산과 equals()메소드
 */
package chap06;

public class ArrayReference1 {

	public static void main(String[] args) {
//		int[] intArray=null;
//		intArray[0]=10; //참조 객체 없으므로 Nullpointexception
		
		String strVal1="java";//
		String strVal2="java";//strVal1,2가 같은 객체인 "java"를 가르킴
		
		if(strVal1==strVal2) {
			System.out.println("strVal1, strVal2 same string.");
			
		}else System.out.println("strVal1, strVal2 different string.");
		
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1, strVal2 same string.");
		}
		
		String strVal3= new String("mklee");
		String strVal4= new String("mklee");//val3,4가 다른 객체인 "mklee"를 가르킴
		
		if(strVal3==strVal4) {
			System.out.println("strVal3, strVal4 same string.");
			
		}else System.out.println("strVal3, strVal4 different string.");
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3, strVal4 same string.");
		}
		
		
		
		
		
	}

}
