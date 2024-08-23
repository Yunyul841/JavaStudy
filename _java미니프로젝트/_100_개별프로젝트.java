package _java미니프로젝트;

import java.util.Random;
import java.util.Scanner;

public class _100_개별프로젝트 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // 키보드로부터 입력받기 위한 객체
		Random r = new Random(); // 랜덤한 번호를 뽑기위한 반복
		String[] word = { "가지", "고구마", "사자", "주사위", "강아지", "다리미", "파도", "기차", "차표", "모자", "매미", "모기", "거미", "바나나",
				"아버지", "고양이", "호랑이", "기차표", "어머니", "자동차", };
		String[] word1 = { "가는 날이 장날","가는 말이 고아야 오는 말이 곱다", "고생끝에 낙이 온다", "가재는 게 편", "꿩 먹고 알 먹고", "내 코가 석자",
				"누워시 침 뱉기", "놓친 고기가 더 크다", "달걀로 바위 치기", "무자식 상팔자" };

		int sum = 0;
		int cnt = 0;
		int yun = 0;
		int yul = 0;
		String abc = "";
		String zxc = "";
		String ac = "";
		System.out.println("자! 게임을 시작한다잉~");
		System.out.println("3");
		System.out.println("2");
		System.out.println("1");
		System.out.println("let go~!!!!!!");
		for (int i = 0; i < word.length; i++) { // 인트 i가 0이고 i가 word.length보다 작을 때 i가 1씩 증가!
			String randomWord = word[r.nextInt(word.length)];
			/*
			 * word[]에서 [] 내부에 있는 인덱스 숫자를 r.nextInt(word.length)로 표현한다. r.nextInt();에서 ()내부에
			 * 있는 숫자를 (word.length)로 표현한다.
			 */
			System.out.println(randomWord);
			abc = in.nextLine();
			if (randomWord.equals(abc) == true) {
				System.out.println("정답이야!! ");
				sum += 20; // 정답일떄 20점이 sum에 저장
				cnt++; // 횟수 증가
				System.out.println(sum + "점");
				System.out.println("다음문제 Go~");
			} else {
				System.out.println("오답이잖아 정신 안차려? 죽을래??");
				System.out.println("정신 차리고 다시 가보자!");
				sum -= 20; // 정답이 아닐 때 -10점이 sum에 저장
				cnt++; // 횟수 증가
				System.out.println(sum + "점");
			}
			if (cnt >= 5 && sum == 100) { // cnt가 5 크거나 같으면서 sum 100 일 때
				System.out.println("야! 너 너무 잘한다!?");
				break; // 브레이크를 걸어서 for문을 끝내버린다.
			} else if (cnt == 5) { // 아니면 만약에 cnt가 5랑 같을 떄
				System.out.println("중간 집계 합니다!" + sum + "점입니다");
				System.out.println("넌 안되것다...가망이 없긴한데..");
				System.out.println("다시 해보자!!");

			}

		}
		System.out.println("다음 게임도 Go?");
		System.out.println("-----------------------------");
		System.out.println("다음 게임을 시작하지~");
		for (int i = 0; i < word1.length; i++) {
			String randomWord = word1[r.nextInt(word1.length)];
			System.out.println(randomWord);
			zxc = in.nextLine();
			if (randomWord.equals(zxc) == true) {
				System.out.println("정답이야~");
				yun += 20;
				yul ++;
				System.out.println(yun + "점");
			} else {
				System.out.println("정답이 아니야~");
				yun -= 20;
				yul ++;
				System.out.println(yun + "점");
			}
			if(yul >= 5 && yun == 100) {
				System.out.println("너 진짜 너무 잘한다..");
				System.out.println("게임을 종료할게~");
				break;
			}else if(yul == 5) {
				System.out.println("중간 집계를 한다~" + yun + "점입니");
				System.out.println("100점이 될 때 까지 계속 해라~~~");
				continue; // 컨티뉴로 for문을 다시 계속 돈디.
				
			}

			
		}
	}
}
