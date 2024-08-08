package _03for;

public class _01문제 {

	public static void main(String[] args) {
		
		/* 
		 * 0
		 * 1
		 * 2
		 * 3
		 * 4
		 */
		/*
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1
		 * 0
		 */
		/*
		 * 0
		 * 2
		 * 4
		 * .
		 * .
		 * .
		 * 94
		 * 96
		 * 98
		 */
		/*
		 * 5
		 */
		//1번
		int b = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2==1) {
				 b = b+i; // b+=i;
			}else 
				b = b-i;  // b-=i;
		}
		System.out.println(b );
		
		//2번
		int c = 0;
		int d = 0;
		for(int i = 1; i <=100; i++) {
			if(i % 2==1) {
				c = c+i;	// c+=i;
			}else
				d = d+i;	// d+=i;
		}
		System.out.println(c+","+d);
		
		
		
		//3번
		int a = 0;
		for(int i= 1; i <= 100; i++) {
			if(i % 2 == 1) {
			a++;
			}
		} System.out.println(a);
	
	}
}






