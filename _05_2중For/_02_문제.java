package _05_2중For;

public class _02_문제 {

	public static void main(String[] args) {
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		// 1) 줄을 출력 (i)
		// 2) 줄에서 열이 순서대로 출력(j)
		// 3) i=4			i=3			i=2			i=1		i=0
		//  j=0.1.2.3.4    j=0.1.2.3	j=0.1.2		j=0.1	j=0
		}

	}

}
