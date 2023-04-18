/*
 * 2023-04-18
 * 최원진
 * Arrays클래스-System.arraycopy(str1,0,str2,0,len)
 * 				
 * 
 */
package chap06;
import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int num1[]= {10,20,30};
		int num2[]= {40,50,60};
		String str3[]= {"java","array","copy"};
		String str4[]= new String[5];
		
		//배열 요소 값들 각각 복사
		for(int i=0;i<num1.length;i++) {
			num2[i]=num1[i];
		}
		for(int i:num2)//num2 출력(10,20,30)
			System.out.print(i+" ");		
		
		System.arraycopy(str3,0,str4,0,3);
		System.out.print("\nstr4 value:");
		//System.arraycopy()로복사
		
		for(String value:str4)
			System.out.print(value+" ");
		String str5[]=Arrays.copyOf(str3,2);
		
		System.out.print("\nstr5 value:");
		for(String value1:str5)
			System.out.print(value1+" ");
		
		
		
		

	}

}
