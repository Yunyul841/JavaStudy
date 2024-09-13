package _06_Array2;

public class _16_문제 {

	public static void main(String[] args) {
		int[][] a= new int[4][5];
		int num =1;
		// 5번문제
		//	1	2	3	4	5					행은 고정 열은 0~4까지 증가
		//	14	15	16	17	6					열은 고정 행은 1~3까지 증가
		//	13	20	19	18	7					행은 고정 열은 3~0까지 증가
		//	12	11	10	9	8					열은 고정 행은 2~1까지 감소
		
		// 변수 4개 만들기
		int minrow = 0; //행최소값
		int maxrow = 3; //행최대값
		int mincol = 0; //열최소값
		int maxcol = 4; //열최대값
		for(int j = 0; j < 2; j++) {
			for(int i = mincol; i <=maxcol; i++) {
				a[minrow][i]=num++;
			}
			// 위 반복문이 완료되었다면 0번행은 더이상 채울필요는 없다.
			// 행의 최소값을 증가시켜 버린다.
			minrow++;
			for(int i=minrow;i <=maxrow; i++) {
				a[i][maxcol]=num++;
			}
			maxcol--;
			for(int i= maxcol; i>=mincol; i-- ) {
				a[maxrow][i]=num++;
			}
			maxrow--;
			for(int i = maxrow; i>=minrow; i-- ) {
				a[i][mincol]=num++;
			}
			mincol++;
			
		}
		// 맨 위에쪽 부분 숫자채우기
		// 맨 위에는 행최소값 0 열최소값 0 열최대값4
		// 맨 위(두번쨰는 행최소값 1 열최소값 1 열최대값 3
//		for(int i = mincol; i <=maxcol; i++) {
//			a[minrow][i]=num++;
//		}
//		// 위 반복문이 완료되었다면 0번행은 더이상 채울필요는 없다.
//		// 행의 최소값을 증가시켜 버린다.
//		minrow++;
//		for(int i=minrow;i <=maxrow; i++) {
//			a[i][maxcol]=num++;
//		}
//		maxcol--;
//		for(int i= maxcol; i>=mincol; i-- ) {
//			a[maxrow][i]=num++;
//		}
//		maxrow--;
//		for(int i = maxrow; i>=minrow; i-- ) {
//			a[i][mincol]=num++;
//		}
//		mincol++;
		
	
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
				System.out.println();
		}

			
	}

}











