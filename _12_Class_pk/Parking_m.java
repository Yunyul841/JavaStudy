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
			int number = in.nextInt();
			in.nextLine();
			System.out.println(number+"선택함");
			if(number == 1) {
				add();
			}else if(number == 2) {
				yun();
			}else if(number == 3) {
//				yul();
			}else if(number == 4) {
				allList();
			}else {
				break;
			}
		}	
	}
	public void add() {
		System.out.println("자동차 등록");
		Parking_Obj parking = new Parking_Obj(); 
		System.out.println("자동차 이름 입력");
		parking.name = in.nextLine();
		System.out.println("자동차 번호 입력");
		parking.carNum = in.nextInt();
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
	public void yun() {
		System.out.println("자동차 조회");
		
		
			}
	}


