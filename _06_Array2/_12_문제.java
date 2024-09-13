package _06_Array2;

public class _12_문제 {

	public static void main(String[] args) {
//		// 1번 문제
//		17	13	9	5	1
//		18	14	10	6	2
//		19	15	11	7	3
//		20	16	12	8	4
		
		
		
		
				// 문제를 보고 파악해야하는 체크 해야될 포인트
				// 숫자는 1~20을 가지고 있으며, 어느 순서로 가고 있다.
				// 배열의 길이는 정해져있다. int[][] a= new int[4][5];
				// 여기서 중요한 것은 처음 값을 입력하는 지점 시작지점을 봐야하고,
				// 행과 열을 체크한다.
				// 행과 열? 무엇을 체크를 하는가?
				// 몇번째 행에서 몇번쨰 열에 시작하고 끝나는지 체크
				// 문제를 보았을 때,
				// 열(↓)은 밑으로 증가,
				// 행(←)은 감소하는걸로 볼 수있다. 
				// 즉, 열 4,3,2,1,0 감소하고, 헹은 0,1,2,3 증가,인 걸 확인 할 수있다
				// 행은 바깥쪽 for문, 열은 안쪽 for문으로 하면 된다.	
				// 행은 0행의 0번열까지 찍어야하기 떄문에  반복문에 i >= 0;쓴 후,  
				// 감소해야하기 때문에 증감식 i--를 해야한다.
		int[][] a= new int[4][5];
		int num =1;
		
	 		for(int i = 4; i >= 0; i--) {	
	 			// 열은 4번쨰 열에서 0번쪠 열로 간다. 즉, 4,3,2,1,이다. 그러므로 감소하니 i--
//	 			System.out.println("현재 열은");
	 			for(int j = 0; j <= 3 ; j++ ) {	
	 				// 행은 0번재 행에서 3번쨰 행으로 간다. 즉, 0,1,2,3,이다 그러므로  증가되니 j++
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
			

