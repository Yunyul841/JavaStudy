package _06_Array2;

public class _03_문제 {

	public static void main(String[] args) {
		//3번문제 2차원 배열의 2열의 모든 값을 행의 순서대로 출력하시오
		int[][] a = {{1,2,3,4,5,},
				 	 {6,7,8,9,10},
				 	 {11,12,13,14,15},
				 	 {16,17,18,19,20},
				 	 {21,22,23,24,25}};
		for(int j = 0; j < 5; j++) {  
			System.out.print(a[j][2]+"\t");
		}
	}

}
