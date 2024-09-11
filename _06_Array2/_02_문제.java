package _06_Array2;

public class _02_문제 {

	public static void main(String[] args) {
		// 2차원 배열 a의 3번쨰 행에서 짝수의 값만 출력하시오.
		int[][] a = {{1,2,3,4,5,},
					 {6,7,8,9,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};
		for(int i = 0; i < a.length; i++) {
			if(a[3][i] % 2 == 0) {
				System.out.print(a[3][i]+" ");
			}
		}
	}
		
}
				// 문제를 봤을 떄 열과 행으로 구분하고
				// 2차원 배열[][] 앞 괄호는 행, 뒤 괄호는 열로 지정
				// i는 행 첨자, j는 열 첨자
				// 문제에서 배열 a의 3번째 행에서 짝수의 값만 출력
				// 짝수를 구하려면 짝수,홀수를 구하는 판별식 사용
				// % 2 == 0 → 짝수 판별식, % 2 == 1 → 홀수 판별식 
				// 그러므로 조건문(if문)에 a[3][i]를 % 2 == 0으로 조건식을 주고
				// 반복문을 돌리면 결과 값은 나올 것이다.
