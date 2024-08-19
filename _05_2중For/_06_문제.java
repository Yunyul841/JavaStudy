package _05_2중For;

public class _06_문제 {

	public static void main(String[] args) {
		//40보다 큰 수는 모두 몇개인가?
		
		int[] a ={34,55,23,56,34,45,34};
		int b = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 40) {
			b++;
			}
		}
		System.out.println("40보다 큰 수의 갯수는" + " " + b + "개");

	}

}
