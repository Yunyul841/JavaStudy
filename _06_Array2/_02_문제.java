package _06_Array2;

public class _02_문제 {

	public static void main(String[] args) {
		// 2차원 배열 a의 3번쨰 행에서 짝수의 값만 출력하시오.
		int[][] a = {{1,2,3,4,5,},
					 {6,7,8,9,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};
		for(int i = 0; i < 5; i++) {
//			System.out.print(a[3][i]);
			if(a[3][i] % 2 ==0) {
				System.out.print(a[3][i]+"\t");
			}
		}
	}

}
