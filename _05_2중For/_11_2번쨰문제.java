package _05_2중For;

public class _11_2번쨰문제 {

	public static void main(String[] args) {
//		배열의 평균값을 구하시오. 소수점 표현하시오. 
		int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		int avg = 0;
		
		for(int i = 0; i <arr.length; i++) {
			
			avg += arr[i];
		}

		System.out.println((double)avg / arr.length);
	}

}
