package _05_2중For;

public class _13_2번쨰문제 {

	public static void main(String[] args) {
		//	3. 팩토리얼의 합 구하기 b (2중 for로 해결)
		//	1부터 10까지 숫자의 각패토리얼의 합을 구하시오
		//	예를들어 4의 팩토리얼은  1*2*3*4
		//	5의 팩토리얼은 1*2*3*4*5
		String sum = "";
		int fact = 1;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				fact *= j;
			}
			sum += fact + " ";	// fact의 값을 SUM의 대입 
			fact = 1; 	//fact의 값을 초기화 
		}
		System.out.println(sum);
	}
}
