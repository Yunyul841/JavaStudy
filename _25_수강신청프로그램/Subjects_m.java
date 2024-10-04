package _25_수강신청프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Subjects_m {
	ArrayList<Grade_One> glist = new ArrayList<>();
	
	
	public void yul(){
		while(true) {
			Scanner in = new Scanner(System.in);
			menu();     			
			int age = in.nextInt();
			in.nextLine();
			if(age == 1) {
				addS();
			}else if(age == 2) {
				delS();
			}else if(age == 3) {
				sear();
			}else if(age == 4) {
				AllS();
			}else if(age == 5) {
				break;
			}
		}
	}
	public void menu() {
		System.out.println("1. 등록");
		System.out.println("2. 삭제");
		System.out.println("3. 검색");
		System.out.println("4. 전체보기");
		System.out.println("5. 종료");
		System.out.print("선택 >>  ");
	}
	private void addS() {
		// 등록기능
	Scanner in = new Scanner(System.in);
	Grade_One aaa = new Grade_One();
	System.out.println("학생의 이름을 입력하세요");
	String name = in.nextLine();
	aaa.setName(name);
	System.out.println("학생의 학년을 입력하세요");
	String grade = in.nextLine();
	aaa.setGrade(grade);
	System.out.println("학생의 아이디를 입력하세요");
	String id = in.nextLine();
	aaa.setId(id);
	System.out.println("학생의 전화번호를 입력하세요");
	String phonenum = in.nextLine();
	aaa.setPhonenum(phonenum);
	glist.add(aaa);
		
	}
	public void delS() {
		// 삭제기능	
		int cnt = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("삭제할 아이디를 입력해주세요");
		String Cid = in.nextLine();
		for(int i = 0; i < glist.size(); i++) {
			if(glist.get(i).getId().equals(Cid)) {
				glist.remove(i);
				System.out.println("학생의 모든 정보가 삭제되었습니다");
				cnt++;
				break;
			}
		}
		
		if(cnt == 0) {
			System.out.println("입력하신 ID는 존재하지 않습니다.");
		}
	}


	private void sear() {
		// 검색기능
		Scanner in = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요");
		String Sname = in.nextLine();
		for(int i = 0; i < glist.size(); i++) {
			if(glist.get(i).getName().contains(Sname)) {
				glist.get(i).prt();
			}
		}
		
	}


	public void AllS() {
		// 전체보기 기능
		for(int i = 0; i < glist.size(); i++) {
			glist.get(i).prt();
		}
	}

}
