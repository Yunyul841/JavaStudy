package _05_2중For;

public class _04_문제 {

	public static void main(String[] args) {
		//4번문제
		//*******  
		//0*****
		//00***
		//000* 
		
//		for(int i = 4; i > 0; i--) {
//			for(int k = 1; k < 5-i; k++) {
//					System.out.print(" ");
//			}
//			for(int j = 0; j < 2*i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i= 3; i >=  0; i--) {
			for(int j=0; j < 4+i; j++) {
				if(j >= 3-i) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
		
	}
}


