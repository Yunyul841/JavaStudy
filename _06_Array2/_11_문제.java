    package _06_Array2;

public class _11_문제 {

	public static void main(String[] args) {
		int[][] a = {{9,1,0},
				 	 {0,1,0},
				 	 {0,1,1}};
			//왼쪽으로 돌릴 때
		/*
		001
		111
		100
		*/
		for(int i = 2; i >= 0;i--) {
			for(int j = 0; j < 3; j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		}
}
