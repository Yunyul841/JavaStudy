package _05_2중For;

public class _03_문제 {

	public static void main(String[] args) {
		//3번문제.
//		000*
//		00***
//		0*****
//		*******
//		
//		for(int i = 1; i < 5; i++) {
//			for(int k = 1; k < 5-i; k++) {
//					System.out.print(" ");
//			}
//			for(int j = 0; j < 2*i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 4+i; j++) {
				if(j >= 4-i-1) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}

