package _java미니프로젝트;

import java.util.Random;
import java.util.Scanner;

public class _100_개별프로젝트 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // 키보드로부터 입력받기 위한 객체
		Random r = new Random(); // 랜덤한 번호를 뽑기위한 반복
		String[] word = { "가지", "고구마", "사자", "주사위", "강아지", "다리미", "파도", "기차", "차표", "모자", "매미", "모기", "거미", "바나나", "아버지",
				"고양이","호랑이","기차표","어머니","자동차",};
			
		int sum = 0;
		int cnt = 0;
		String abc = "";
		System.out.println("게임을 시작합니다!");
		for (int i = 0; i < word.length; i++) { // 인트 i가 0이고 i가 word.length보다 작을 때 i가 1씩 증가!
			String randomWord = word[r.nextInt(word.length)];
			/*
			 * word[]에서 [] 내부에 있는 인덱스 숫자를 r.nextInt(word.length)로 표현한다. 
			 *	r.nextInt();에서 ()내부에 있는 숫자를 (word.length)로 표현한다.
			 */
			System.out.println(randomWord);
			abc = in.nextLine();
			if (randomWord.equals(abc) == true) {
				System.out.println("정답입니다!");
				sum += 20; // 정답일떄 20점이 sum에 저장
				cnt++; // 횟수 증가
				System.out.println(sum +"점");
			} else {
				System.out.println("오답입니다!");
				sum -= 20; // 정답이 아닐 때 -10점이 sum에 저장
				cnt++; // 횟수 증가
				System.out.println(sum + "점");
			}
			if (cnt >= 5 && sum == 100) { // cnt가 5 크거나 같으면서 sum 100 일 때 
				System.out.println("good~ 너무잘했어요!");
				break; //브레이크를 걸어서 for문을 끝내버린다.	
			} else if (cnt == 5) { // 아니면 만약에 cnt가 5랑 같을 떄 
				System.out.println("중간 집계 합니다!" + sum + "점입니다");
				System.out.println("100점이 될때까지 도전하세요!");
				continue; // 컨티뉴로  for문을 다시 계속 돈디.

			}

		}
		in.close();

	}

}
