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
			System.out.println("---------");
	
			
		//３번　문제　비밀편지
		//String word ="gehoudfkimjnlvy";
		//int[] letter={8,12,3,13,1,14,3,4};
		//letter  배열은 word문자열 알파벳의 위치이다.
		//letter배열의 암호를 풀어서 편지의 내용을 출력하시오.
			
		String word ="gehoudfkimjnlvy";
		int[] letter4={8,12,3,13,1,14,3,4};
		String resultWord = "";
		for(int i=0; i < letter4.length; i++) {
			resultWord += word .charAt(letter4[i]);
			//System.out.print(word .charAt(letter[i]));
		}
		System.out.print(resultWord);
		System.out.println();
		System.out.println("---------");
	
		

		//4 난건물주
		//arr 배열에서 0이 의미하는 것은 공터이다. 
		//size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		//size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		//size가 2일경우에 7개이다. 
		// 2 2 3 3 2
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int cnt = 0;
		int size = 2;
		for(int i = 7; i  < arr.length-1; i++) {
			if(arr[i] + arr[i+1] == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

	
