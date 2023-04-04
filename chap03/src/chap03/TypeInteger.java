/*
 * 
 * 2023.3.21
 * 최원진
 */
package chap03;

public class TypeInteger {

	public static void main(String[] args) {
		int var1 = 0b1011;
		int var2 = 0xB3;
		int var3 = 356;
		int var4 = -128;		
//		int var5 = 128; 컴파일 에러
		long var6 = 10000000000L; //정수 리터럴이 int타칩의 허용 범위 넘는경우 'L'붙이기
//		lovg var7 = 10000000000; 
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		String name = "mklee";
		String str1 = "I like \"java\"";
		String str2 = "number\tname\ttage";
		
		System.out.printf("%d\n",var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var6);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(name);
		System.out.println(str1);
		System.out.println(str2);
		
		
		
		
		

	}

}
