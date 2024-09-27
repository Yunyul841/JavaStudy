package _Park_project;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
	ArrayList<CarOne> clist = new ArrayList<>();
	Parking park = new Parking();
	
 	MainMenu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 입고차량");
			System.out.println("2. 출차차량");
			System.out.println("3. 주차공간보기");
			System.out.println("4. 입고 차량 전체보기");
			System.out.println("5. 종료");
			int num = in.nextInt();
			in.nextLine();
			System.out.println(num +"선택함");
			if(num == 1) {
				inCar(); // 입차
			}else if(num == 2) {
				outCar(); // 출차
			}else if(num == 3) {
				ListPark(); // 주자공간보기
			}else if(num == 4) {
				ListCar(); // 입고차량전체보기
			}else if(num == 5) {
				break; // 종료
			}	
		}
	}
	public void inCar() { // 입차
		Scanner in = new Scanner(System.in);
		CarOne car = new CarOne();
		int cnt = 0;
//		int cnt1 = 50;
//		int cnt2 = 50;
//		int cnt3 = 50;
		System.out.println("차량번호를 입력하세요");
		car.cNumber = in.nextLine();
//		car.setcNumber(cNumber);
		System.out.println("주차된 층을 입력하세요");
		car.cFloor = in.nextLine();
		for(int i = 0; i < clist.size(); i++) {
			if (car.cNumber.equals(clist.get(i).cNumber)){
				cnt++;
				System.out.println("이미 입고된 차량입니다.");	
			}	
		}
		if (cnt == 0) {
			if (car.cFloor.equals("1")) {
				clist.add(car);
				park.floor1--; 
				System.out.println("등록되었습니다.");
			}else if(car.cFloor.equals("2")) {
				clist.add(car);
				park.floor2--;
				System.out.println("등록되었습니다.");
			}else if(car.cFloor.equals("3")) {
				clist.add(car);
				park.floor3--;
				System.out.println("등록되었습니다.");
			} else {
				System.out.println("입력한 층이 없습니다.");
			}
			
		}
		// 먼저 입력한 층 값이 조건에 있는지 확인을 한 후
		// 조건에 맞으면 진행
//		while(true) {}
//		if (car.cFloor.equals("1")) {
//			park.floor1--;
//		}else if(car.cFloor.equals("2")) {
//			park.floor2--;
//		}else if(car.cFloor.equals("3")) {
//			park.floor3--;
//		} else {
//			System.out.println("입력한 층이 없습니다.");
//		}
	
		

//		car.setcFloor(cfloor);
		
		}

	private void outCar() { // 출차
 		CarOne car = new CarOne();
		Scanner in = new Scanner(System.in);
		System.out.println("출차할 차량번호를 입력하세요");
		String cNum = in.nextLine();
		System.out.println("출차된 층을 입력하세요");
		String cfor = in.nextLine();

		for(int i = 0; i < clist.size(); i++) {
			if(clist.get(i).cNumber.equals(cNum) && clist.get(i).cFloor.equals(cfor)) {
				if(cfor.equals("1")) {
					park.floor1++;
				}else if(cfor.equals("2")) {
					park.floor2++;
				}else if(cfor.equals("3")) {
					park.floor3++;
				}
				System.out.println("출차되었습니다");
				clist.remove(i);	
			}
			
		}
	 }		
	private void ListPark() { // 주차공간보기
			park.pPrt();
	}
		
	private void ListCar() { // 입고차량보기
		for(int i = 0; i < clist.size(); i++) {
			clist.get(i).cPrt();
		}	
	}
}
