package _06_Array2;

public class _12_문제 {

	public static void main(String[] args) {
//		// 1번 문제
//		int[][] a = {{17,13,9,5,1 },
//					 {18,14,10,6,2},
//					 {19,15,11,7,3},
//					 {20,16,12,8,4}};
		
	 	int[][] a= new int[4][5];
		int num =1;
		
	 		for(int i = 4; i >= 0; i--) {
	 			for(int j = 0; j < 4; j++ ) {
	 				a[j][i]=num;
	 				num++;
	 			}
	 		}
	 	
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j]+"  ");
				}
				System.out.println();
		}
	}
}


