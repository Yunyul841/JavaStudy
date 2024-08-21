package _05_2중For;

import java.util.Scanner;

public class _12_2번째문제 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = in.nextLine(); 
		int apple = 0;
		for(int i = 0; i < id.length(); i++) {
			if(id.charAt(i)=='@') {
				apple++;
			}
		}
		System.out.println(id + "문자열에는 @가 "+apple+"개 있습니다.");
	}

}
