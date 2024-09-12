package _06_Array2;

public class _13_문제 {

	public static void main(String[] args) {
//		2번문제
//		20	19	18	17	16
//		15	14	13	12	11
//		10	9	8	7	6
//		5	4	3	2	1
		
		
		
		// 문제를 보고 파악해야하는 체크 해야될 포인트
		// 숫자는 1~20을 가지고 있으며, 어느 순서로 가고 있다.
		// 배열의 길이는 정해져있다. int[][] a= new int[4][5];
		// 여기서 중요한 것은 처음 값을 입력하는 지점 시작지점을 봐야하고,
		// 행과 열을 체크한다.
		// 행과 열? 무엇을 체크를 하는가?
		// 몇번째 행에서 몇번쨰 열에 시작하고 끝나는지 체크
		// 문제를 보면 
		
		
		int[][] a= new int[4][5];
		int num =1;
		for(int i = 3; i >= 0; i--) {	// 행은 3번쨰 행에서 0번쨰 행으로 간다. 즉, 3,2,1,0 이므로 i는 감소하니 i--
			for(int j = 4; j >= 0; j--) {	// 열은 4번째 열에서 0번쨰 열로 간다. 즉, 4,3,2,1,0 이므로 j는 감소하니 j--
				a[i][j]=num;
				num++; 
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
