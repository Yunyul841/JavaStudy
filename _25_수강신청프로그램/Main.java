package _25_수강신청프로그램;

import java.util.Scanner;

public class Main {

	Scanner in = new Scanner(System.in);
	Subjects_m a = new Subjects_m();
	Class_m b = new Class_m();
	
	Main() {
		
		while(true) {
			System.out.println("원하시는 메뉴얼을 선택해주세요");
			System.out.println("1.학생관리		2.교과목관리	3.로그아웃");
			String c = in.nextLine();
			if (c.equals("1")) {
				a.yul();
			} else if (c.equals("2")) {
				b.yul();
			} else if (c.equals("3")) {
				break;
			}
		}
	}
}
