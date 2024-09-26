package _21_Pak_Miniproject;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
	ArrayList<CarOne> clist = new ArrayList<>();
	
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
	private void inCar() { // 입차
		Scanner in = new Scanner(System.in);
		CarOne car = new CarOne();
		System.out.println("차량번호를 입력하세요");
		String cNumber = in.nextLine();
		System.out.println("주차된 층을 입력하세요");
		String cfloor = in.nextLine();
		
	}
		
	
		
		
	
	private void outCar() { // 출차
		
		}
		
	
	private void ListPark() { // 주차공간보기
		for(int i =0; i < clist.size(); i++) {
			clist.get(i).cPrt();
		}
		
		
	}
	private void ListCar() { // 입고차량보기
		for(int i = 0; i < clist.size(); i++) {
			clist.get(i).cPrt();
		}
		
	}
}
