package _25_수강신청프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class login {
	Scanner in = new Scanner(System.in);
	ArrayList<log_One> olist = new ArrayList<>();
	
	login() {
		while(true) {
			menu();
			log();
		}
	}
	public void menu(){
		System.out.println("수강신청을 할려면 로그인을 해야합니다");
		System.out.println("이메일과 비밀번호를 입력해주세요.");
	}
	
	public void log() {
		int cnt = 0;
		System.out.println("이메일을 입력하세요");
		String aEmail = in.nextLine();
		System.out.println("패스워드를 입력하세요");
		String aPassword = in.nextLine();
		for(int i =0; i < olist.size(); i++) {
			if (olist.get(i).email.equals(aEmail) && olist.get(i).password.equals(aPassword)) {
				System.out.println("로그인이 되었습니다.");
				new Main();
				cnt = 1;
			}
			
		}
		if (cnt == 0) {
			System.out.println("가입된 정보가 없습니다.");
			rkdlq();
		}
		
	}
	
	
	private void rkdlq() {
		System.out.println("회원가입으로 넘어갑니다.");
		System.out.println();
		log_One mn = new log_One();
		System.out.println("이메일을 입력하세요");
		mn.email = in.nextLine();
		System.out.println("패스워드를 입력하세요");
		mn.password = in.nextLine();
		olist.add(mn);
		System.out.println("회원가입이 완료되었습니다.");
	}
}
