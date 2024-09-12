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
		
		  for(int i = 0; i < a.length; i++) {		// 행은 0번쨰 행에서 3번째 행까지 증가한다 즉, 0,1,2,3 으로 증가하므로   i++
			  if(i % 2 == 0) {						// 조건식 (i)을(를) 2로 나누었을 때 짝수이면 출력 아니면 홀
				  for(int j = 0; j < a[i].length; j++) {	// 열은 0번쨰에서 4번쨰까지 증가한다. 즉, 0,1,2,3,4으로 증가하므로 i++
					  a[i][j]=num;
						 num++;	 
				  }
			 } else {
				 for(int j = a[i].length-1; j >=0; j--) {	// 이 반복문은 1,3행 역순! 4,3,2,1,0 으 감소한다 그래서 j--
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
