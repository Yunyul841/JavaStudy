package _16_Class_customer;

import java.util.Scanner;

public class C_center {
	Scanner in = new Scanner(System.in); 
	C_one[] clist = new C_one[10];
	public C_center() {
		while(true) {
			mune();
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();
			}else if(selNum == 2) {
				clistall();
			}else if(selNum == 3) {
				mod();
			}else if(selNum == 4) {
				delect();
			}else if(selNum == 5) {
				break;
			}
		}	
	}
	public void mune() {
		System.out.println("1. 고객가입");
		System.out.println("2. 정보보기");
		System.out.println("3. 수정하기");
		System.out.println("4. 삭제하기");
		System.out.println("5. 종료");
	}
	
	private void delect() {
		// 삭제기능
		System.out.println("삭제할 Id를 입력하세요");
		String stId = in.nextLine();
		for(int i = 0; i < clist.length; i++) {
			if(clist[i] != null) {
				if(clist[i].c_Id.equals(stId)) {
					clist[i] = null;
					break;
				}
			}
		}
		
		
	}
	private void mod() {
		// 수정기능
		System.out.println("고객 이름 입력");
		String newName = in.nextLine();
		System.out.println("수정할 아이디 입력");
		String tr = in.nextLine();
		for(int i = 0; i < clist.length; i++) {
			if(clist[i] != null) {
				if(clist[i].c_Id.equals(tr) && clist[i].c_Name.equals(newName)) {
					System.out.println("수정된 아이디를 입력하세요");
					String newId = in.nextLine();
					clist[i].c_Id = newId;
					
				}
			}
		}		
	}
	
	
	private void clistall() {
		// 정보보기 기능
		for(int i = 0; i < clist.length; i++) {
			if(clist[i] != null) {
				clist[i].prt();
			}
		}
	}
		
	
	private void add() {
		// 고객가입 기능
//		Scanner in = new Scanner(System.in);
		C_one select = new C_one();
		System.out.println("고객 아이디를 입력하시오");
		select.c_Id = in.nextLine();
		System.out.println("고객 이름을 입력하시오");
		select.c_Name = in.nextLine();
		for(int i = 0; i < clist.length; i++) {
			if(clist[i]==null) {
				clist[i] = select;
				break;
			}
		}
	}
	

}
