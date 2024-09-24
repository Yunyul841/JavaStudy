package _16_Class_customer;

import java.util.Scanner;

public class C_center {
	Scanner in = new Scanner(System.in); 
	C_one[] clist = new C_one[10]; // 객체를 저정하는 배열로, 최대 10개의 고객정보를 저장함
	public C_center() {
		while(true) {
			mune(); // 메뉴를 출력하는 메서드
			int selNum = in.nextInt();//nextInt() 메서드를 사용하여 사용자가 입력한 정수를 가져옴
			in.nextLine(); // nextLine()으로 문자열을 입력받을 때 문제가 발생하지 않도록 하기 위해서 
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
		String stId = in.nextLine(); // 삭제할 고객의 id를 키보드로 부터 입력 stId변수에 저장
		System.out.println("삭제할 Name를 입력하세요");
		String git = in.nextLine(); // 삭제할 고객의 name를 키보드로 부터 입력받아 git변수에 저장
		for(int i = 0; i < clist.length; i++) {
			// 배열의 각 요소를 순회하기 위한 루프입니다. 배열의 크기만큼 반복한다.	
			if(clist[i] != null) { // clist[i] != null이 같이 않을 때 아래 조건을 확인
				if(clist[i].c_Id.equals(stId) && clist[i].c_Name.equals(git)) {
					// 현재 c_Id와 c_Name이 사용자가 입력한 stId와 git이 일치하는지 확인
					clist[i] = null; // 아이디와 이름이 모두일치하는 경우 인덱스를 null로 설정하여 고객정보 삭제
					break;
				}
			}
		}
		
		
	}
	private void mod() {
		// 수정기능
		System.out.println("고객 이름 입력");
		String newName = in.nextLine(); // 입력된 이름을 NewName변수에 저장
		System.out.println("수정할 아이디 입력");
		String tr = in.nextLine();	//입력된Id를 tr변수에 저장
		for(int i = 0; i < clist.length; i++) {
			if(clist[i] != null) {	//clist[i] != null이 같이 않을 때 아래 조건을 확인
				if(clist[i].c_Id.equals(tr) && clist[i].c_Name.equals(newName)) {
					// c_ID와 c_Nume을 tr과 newName이 일치하는지 확인
					System.out.println("수정된 아이디를 입력하세요");
					String newId = in.nextLine(); 
					clist[i].c_Id = newId;
					// 일치하는 고객의 정보를 찾았을 경우, 고객의c_id를 newID로수정
					
				}
			}
		}		
	}
	
	
	private void clistall() {
		// 정보보기 기능
		for(int i = 0; i < clist.length; i++) {
			if(clist[i] != null) {
				// clist[i] != null 같지 않을 때
				clist[i].prt();
			// C_one 클래스에 있는 Prt()메소드를 호출하여 고객정보를 출력함
			}
		}
	}
	
	
	private void add() {
		// 고객가입 기능
//		Scanner in = new Scanner(System.in);
		C_one select = new C_one();
		// Select라는 새로운 객체를 생성 이 객체는 새 고객의 정보를	저장함
		System.out.println("고객 아이디를 입력하시오");
		select.c_Id = in.nextLine();
		// 입력된 고객의 id를 select.c_Id에 저장
		System.out.println("고객 이름을 입력하시오");
		select.c_Name = in.nextLine();
		// 입력된 고객의 Name를 select.c_Name에 저장
		for(int i = 0; i < clist.length; i++) {
			if(clist[i]==null) {
				// (clist[i]==null) 같을 때 빈 배열을 찾음
				clist[i] = select;
				// 새로운 고객의 정보를 Clist[i]에 저장
				break;
			}
		}
	}
	

}
