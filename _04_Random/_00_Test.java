package _04_Random;

import java.util.Random;

public class _00_Test {

	public static void main(String[] args) {
		// 시나리오.. 랜덤한 숫자를 뽑아서 로또 번호로 저장한다.
		// 로또 번호 저장할 배열
		Random r = new Random();	// Ctrl + shift + o(영어로)
		// 배열 저장 변수
		int[] lotto = new int[6]; 
		// 변수명.길이.index 랜덤한 번호를 추출하기 위한 객체 만들기.
		for(int i =0; i < lotto.length; i++) {
			System.out.println((i+1)+"번째");
			int k = r.nextInt(45)+1;
			// r변수 참조하여 nextInt라는 기능을 호출, 리턴 받을 수에 +1를 한다.
			lotto[i] = k;
		}
		// 로또 번호를 출력하는 반복문
		for (int i = 0; i < lotto.length; i++) {
			if(i==lotto.length-1) { //마지막 번호
				System.out.println("보너스 : " + lotto[i]);
			}else {
				System.out.println(lotto[i]);
				
				
			}
		}
		
	}
}
