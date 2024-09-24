package _16_Class_customer;

import java.util.Scanner;

public class E_center {
	Scanner in = new Scanner(System.in); 
	E_one[] event = new E_one[5];
	public  E_center() {
		while(true) {
			mune();
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1 ) {
				add();
			}else if(selNum == 2) {
				elistall();
			}else if(selNum == 3) {
				break;
			}	
		}
	}
	public void mune() {
		System.out.println("1. 이벤트등록");
		System.out.println("2. 전체보기");
		System.out.println("3. 종료");
	}
	public void elistall() {
		for(int i = 0; i < event.length; i++) {
			if(event[i] != null) {
				event[i].prt();
			}
		}
	}
	public void add() {
		E_one tr = new E_one();
		System.out.println("이벤트 제목을 입력하시오");
		tr.title = in.nextLine();
		System.out.println("이벤트 내용을 입력하시오");
		tr.detail = in.nextLine();
		for(int i = 0; i < event.length; i++) {
			if(event[i] == null) {
				event[i] = tr;
				break;
			}
		}
	}
}
	

