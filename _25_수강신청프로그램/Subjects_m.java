package _25_수강신청프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Subjects_m {
	ArrayList<Grade_One> glist = new ArrayList<>();
	


	
	

	Subjects_m(){
		while(true) {
			Scanner in = new Scanner(System.in);
			menu();     			
			int age = in.nextInt();
			in.nextLine();
			if(age == 1) {
				addS();
			}else if(age == 2) {
				setS();
			}else if(age == 3) {
				delS();
			}else if(age == 4) {
                sear();
			}else if(age == 5) {
				AllS();
			}else if(age == 6) {				
				break;
			}
			
		}
	}

	
	public void menu() {
		System.out.println("1. 등록");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 검색");
		System.out.println("5. 전체보기");
		System.out.println("6. 종료");
		System.out.print("선택 >>  ");
	}
		private void addS() {
			// 등록
		Scanner in = new Scanner(System.in);
		Grade_One aaa = new Grade_One();
		System.out.println("학생의 이름을 입력하세요");
		aaa.name = in.nextLine();
		System.out.println("학생의 학년을 입력하세요");
		aaa.grade = in.nextLine();
		System.out.println("학생의 아이디를 입력하세요");
		aaa.id = in.nextLine();
		System.out.println("학생의 전화번호를 입력하세요");
		aaa.phonenum = in.nextLine();
		glist.add(aaa);
		
	}

		public void setS() {
			// 수정
		Scanner in = new Scanner(System.in);
		Grade_One aaa = new Grade_One();
		System.out.println("수정할 학생의 이름을 입력하세요");
		String name = in.nextLine();
		System.out.println("수정할 학생의 학년을 입력하세요");
		String grade = in.nextLine();
		System.out.println("수정할 학생의 아이디을 입력하세요");
		String id = in.nextLine();
		System.out.println("수정할 학생의 전화번호를 입력하세요");
		String phonenum = in.nextLine();
		System.out.println("변경할 학생 이름");
		String Aname = in.nextLine();
		System.out.println("변경할 학생 학년");
		String Agrade = in.nextLine();
		System.out.println("변경할 학생 아이디");
		String Aid = in.nextLine();
		System.out.println("변경할 학생 전화번호");
		String Aphonenum = in.nextLine();
		aaa.name = Aname;
		aaa.grade = Agrade;
		aaa.id = Aid;
		aaa.phonenum = Aphonenum;
		 
		for(int i = 0; i < glist.size(); i++) {
			System.out.println("학생의 모든 정보가 변경되습니다.");
			if(glist.get(i).name.equals(Aname) && glist.get(i).grade.equals(Agrade) 
					&& glist.get(i).id.equals(Aid)&& glist.get(i).phonenum.equals(Aphonenum)) {
						glist.set(i, aaa);
						break;
			}
		}
	}

		public void delS() {
			// 삭제	
			Scanner in = new Scanner(System.in);
			System.out.println("삭제할 아이디를 입력해주세요");
			String Cid = in.nextLine();
			for(int i = 0; i < glist.size(); i++) {
				if(glist != null) {
					System.out.println("학생의 모든 정보가 삭제되었습니다");
					if(glist.get(i).id.equals(Cid)) {
						glist.remove(i);
					}else {
						break;
					}	
					System.out.println("학생의 아이디를 정확히 입력해주세요");
						
					
			}
		}
	}


		private void sear() {
			// 검색
			
		}


		public void AllS() {
			// 전체보기
		for(int i = 0; i < glist.size(); i++) {
			glist.get(i).prt();
		}
	}

}
