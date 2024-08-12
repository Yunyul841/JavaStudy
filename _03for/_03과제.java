package _03for;

public class _03과제 {

	public static void main(String[] args) {
		//	0번 int[] letter={8,12,4,13,2,14,4,5}짝수만 출력하시오.
		int[] letter={8,12,4,13,2,14,4,5};
		for(int i =0; i < 8; i++) {
			if(letter[i]%2==0) {
				System.out.println(letter[i]);
			}
		}
		 
		// 1번int[] letter={8,12,4,13,2,14,4,5}
		//배열의 가장 큰수가 있는 인덱스를 출력하시오. // 변수가 2개 필요!
		System.out.println("---------");
		int maxIndex = 0;
		int maxValse = 0;
		int [] letter1={8,12,4,13,2,14,4,5};
			for(int i = 0; i < letter1.length; i++) {
				if(letter1[i] > maxValse) {
					maxValse = letter1[i];
					maxIndex = i;
			}
		}
			System.out.println(maxIndex);

		System.out.println("---------");
		//２번　문제		
		//범인을찾으시오. 
		//범인은 짝수이면서 가장큰 값이다.
		//범인은 14입니다. 
		int max =0;
		int[] letter2={8,12,4,13,25,14,4,5};
			for(int i =0; i < letter2.length; i++) {
				if(letter2[i]%2==0 && letter2[i]> max ) {
					max = letter2[i];
				}
			}
			System.out.println(max);
	
			
		//３번　문제　비밀편지
		//String word ="gehoudfkimjnlvy";
		//int[] letter={8,12,3,13,1,14,3,4};
		//letter  배열은 word문자열 알파벳의 위치이다.
		//letter배열의 암호를 풀어서 편지의 내용을 출력하시오. 
		

	}
}
	