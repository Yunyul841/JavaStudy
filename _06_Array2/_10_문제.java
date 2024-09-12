package _06_Array2;

public class _10_문제 {

	public static void main(String[] args) {
		int[][] a = {{7,1,0},
					 {0,1,0},
					 {0,1,1}};
		// 오른쪽으로 돌릴 떄
		// 순서 배열의 반복문?
				for(int i = 2; i >= 0; i--) {
					for(int j = 0; j < 3; j++) {
						System.out.print(a[j][i]+ " ");
					}
					System.out.println();
				}
		
			}
		}
