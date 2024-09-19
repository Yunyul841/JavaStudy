package _12_Class_pk;

import java.util.Scanner;

public class Parking_m {
// 두번째 클래스는 자동차 등록, 조회, 전체보기, 삭제
	Parking_Obj[] clist = new Parking_Obj[7];
	Scanner in = new Scanner(System.in);
	Parking_m(){
		while(true) {
			System.out.println("주차등록");
			System.out.println("1. 등록");
			System.out.println("2. 조회");
			System.out.println("3. 삭제");
			System.out.println("4. 전체보기");
			System.out.println("선택>>>>");
			int selNum = in.nextInt(); // nextInt()는 엔터 전까지 입력된 숫자를 가져옴 
			in.nextLine();  // nextLine은 Enter를 치기 전까지 쓴 문자열을 모두 리턴(반환)ㄴ
			System.out.println(selNum+"선택함");
			if(selNum == 1) {
				add();
			}else if(selNum == 2) {
				select();
			}else if(selNum == 3) {
				delete();
			}else if(selNum == 4) {
				allList();
			}else {
				break;
			}
		}	
	}
	// 자동차 등록
	public void add() {
		System.out.println("자동차 등록");
		Parking_Obj parking = new Parking_Obj(); 
		System.out.println("이름을 입력하세요");
		parking.name = in.nextLine();
		System.out.println("전화번호를 입력하세요");
		parking.number = in.nextLine();
		System.out.println("자동차 번호 입력");
		parking.carNum = in.nextLine();
			for(int i = 0; i < clist.length; i++) {
				// int i = 0일떄 i가 clist.length보다 작을 떄 i가 증가
				if(clist[i] == null) {
					// clist[i]가 null이랑 같을 때 
					clist[i]=parking;
					// parking의 값을 clist[i]의 저장
					break;
				// for문을 이용한 이유는 clist라는 배열을 전체적으로 체크하기 위해서
				// 배열의 index를 for문의 i를 이용하여 표현하면 됨
				
					
			}
		}
	}
	// 자동차 전체보기
	public void allList() {
		System.out.println("자동차 전체보기");
		for(int i = 0; i < clist.length; i++) {
			// i가 0이고 i가 clist.length보다 작을 때 i가 증가 
			if(clist[i] != null) {
				// clist[i]가 null이랑 같이 않을 때,
				clist[i].prt();
			
			}
		}
	}
	// 자동차 조회
	public void select() {
		System.out.println("자동차 조회");
		System.out.println("차 번호를 입력하세요");
		String carNum = in.nextLine();
		for(int i = 0; i < clist.length; i++) {
			if(carNum.equals(clist[i].carNum)) { // equals()는 비교하고자 하는 대상의 값 자체를 비교한다
				clist[i].prt(); // 
				break;
			}
		}
	}
	// 자동차 번호 삭
	public void delete() {
	System.out.println("자동차 번호 삭제");
	String carNum = in.nextLine();
		for(int i = 0; i < clist.length; i++) {
			if(carNum.equals(clist[i].carNum)) {
				clist[i] = null;
				break;
			}
		}
	}
}
		
	
	
	



