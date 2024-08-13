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
		}
	}



