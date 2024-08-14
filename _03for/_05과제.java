package _03for;

public class _05과제 {

	public static void main(String[] args) {
		
		String word ="gehoudfkimjnlvy";
		int[] letter={8,12,3,13,1,14,3,4};
		String resultWord = "";
		for(int i=0; i < letter.length; i++) {
			resultWord += word .charAt(letter[i]);
			//System.out.print(word .charAt(letter[i]));
		}
		System.out.print(resultWord);
		System.out.println("");
		
		//홀수만 출력
		int[] letter1={8,12,4,13,2,14,4,5};
		for(int i = 0; i <letter1.length; i++) {
			if(letter1[i]%2==1) {
				System.out.print(letter1[i]+",");
			}
		}
		}
	}



