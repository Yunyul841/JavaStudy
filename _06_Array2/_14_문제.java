package _06_Array2;

public class _14_문제 {

	public static void main(String[] args) {
		int[][] a= new int[4][5];
		int num =1;
	
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					if( i % 2 == 0) {
						a[i][j]=num;
						num++;
					}else {
						
						 a[i][j]=num;
						 num++;
					}
								
		}					
}
		
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
	}
}
