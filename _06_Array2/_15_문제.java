package _06_Array2;

public class _15_문제 {

	public static void main(String[] args) {
		int[][] a= new int[4][5];
		int num =1;
//	4번문제
// 1 2 4 7 11
// 3 5 8 12 15
// 6 9 13 16 18
// 10 14 17 19 20	→ i는 8번 반복하면서 숫자를 채워야 한다..0~7번까지 반복
//                    i값을 열의 번호로 본다면 0,1,2,3,4 ??? 모르겠다
//                    이런 경험이 있다. i는 0,1,2,3,4 증가하면 5,6,7,8 이렇게 증가해야한다.
//						i = 0 → 0,0											j = 0
//						i = 1 → 0,1	1,0										j = 0 1
//						i = 2 → 0,2 1,1 2,0 								j = 0 1 2						
//						i = 3 → 0,3 1,2 2,1 3,0								j = 0 1 2 3	
//						i = 4 → 0,4 1,3 2,2 3,1								j = 0 1 2 3 4
//						i = 5 → 0,5 1,4 2,3 3,2 4,1							j = 0 1 2 3 4 5
//						i = 6 → 0,6 1,5 2,4 3,3 4,2 5,1 6,0
//						i = 7 → 0,7 1,6 2,5 3,4 4,3 5,2 6,1 7,0
		
//		j(행) 해결하였고,
//		i(열)을 해결해야한다.
//		i값 j로 해결할 수 없다면 수식필요!
//		수식 : i-j j-i 절대값 *,+,- /
		
		for(int i=0; i < 8; i++) {
			System.out.println(i + "번쨰 채우기를 합니다");
			int newcol=i;
			for(int j=0; j<=i; j++) {
//				if(j > 3) continue;		if절에서 한줄이면 괄호 생략가능
				if(j > 3) break;
				if(newcol < 5) {
					a[j][newcol]=num++;
				}
				newcol--;
//				System.out.println("j<행>"+j+"/열"+newcol);
			}
			System.out.println();
		}
						
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j]+" ");
				}
					System.out.println();
			}

	}
	
}