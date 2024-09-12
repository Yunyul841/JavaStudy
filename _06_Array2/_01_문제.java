package _06_Array2;

public class _01_문제 {

	public static void main(String[] args) {
		// 1번문제 2차원배열의 a의 2번쨰 행의 모든 값을 출력하시오.
		int[][] a = {{1,2,3,4,5,},
					 {6,7,8,9,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[2][i]+" ");
			}
		}
	}       // 문제를 봤을 떄 열과 행으로 구분해야겠다
			// 2차원 배열[][] 앞 괄호는 행, 뒤 괄호는 열로 지정
			// i는 행 첨자, j는 열 첨자
			// 문제를 보면 2차원 배열의 a의 2번 쨰 행의 모든 값을 출력하라고 하였다
			// 즉, 행은 0,1,2,3,4 열은 0,1,2,3,4 보고,
			// 2번 쨰 행의 값을 출력하라고 하였으니 식은 
			// a[2][i] 배열에 2번쨰 줄에서 행의 값을 가져오라고 하였으니 
			// 	for(int i = 0; i < a.length; i++) {
			//	System.out.print(a[2][i]+" ");
			//	}
			// 이렇게 반복문을 사용하여 풀면 된다,


