/*
 * 2023.03.28
 * 최원진
 * 반복문(while)-1~10합계 구하기
 */
package chap05;

public class whileTest {

	public static void main(String[] args) {
		int sum = 0, cnt=1;
		int hap=0,i;
		int total=0,j=0;
		while(cnt<=10) {
			sum+=cnt;
			cnt++;
			
		}
		System.out.println("1~10 total(while):"+sum);
		
		for(i=1;i<=10;i++)
		{
			hap+=i;
		}
		System.out.println("1~10 total(for):"+hap);
		
		do {
			total+=j;
			j++;
		}while(j<=10);
		System.out.println("1~10 total(do~while):"+total);
	}

}
