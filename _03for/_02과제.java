package _03for;

public class _02과제 {

	
	public static void main(String[] args) {
		//1번
		for(int i =100; i < 1000; i++) {
			if(i % 2 == 1) {
				
				System.out.println(i);
			}
		}
		System.out.println("------------");
		
		
		//2번
		int a =0;
		for(int i = 0; i <=100; i++) {
			if(i % 2 == 1) {
				a += i;
			}
		}
		System.out.println(a);
		System.out.println("------------");
		
		//3번
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("------------");
		//4번 
		  int[] arr = {45,23,25,64,3,24,48};
		  for(int i = 0; i < 7; i++) {
			  if (arr[i]% 2 == 0) {
				  
				  System.out.println(arr[i]);
			  }
		  }
	}
}

