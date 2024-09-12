package _06_Array2;

public class _14_문제 {

	public static void main(String[] args) {
		int[][] a= new int[4][5];
		int num =1;
//		3번문제
//	1	2	3	4	5
//	10	9	8	7	6
//	11	12	13	14	15
//	20	19	18	17	16
		
		  for(int i = 0; i < a.length; i++) {
			  if(i % 2 == 0) {
				  for(int j = 0; j < a[i].length; j++) {
					  a[i][j]=num;
						 num++;	 
				  }
			 } else {
				 for(int j = a[i].length-1; j >=0; j--) {
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
