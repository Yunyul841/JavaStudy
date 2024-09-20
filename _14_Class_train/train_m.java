package _14_Class_train;

import java.util.Scanner;

public class train_m {
	train_Obj[] tinList = new train_Obj[4];
	Scanner in = new Scanner(System.in);
		train_m(){
			int selNum = 0;
			while(true) {
				menu();
				System.out.println("번호선택>>");
				selNum = in.nextInt();
				in.nextLine();
				if(selNum == 1) {
					triAdd();	// 등록
				}else if(selNum == 2) {
					triMod();	// 수정
				}else if(selNum == 3) {
					tinList();	// 조회
				}else if(selNum == 4) {
					break;					
				}
			}
		}
		public void menu() {
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4.  끝");
		}
		// 등록
		public void triAdd() {
			train_Obj over = new train_Obj(); 
			int tr = tinList.length; 
			System.out.println("기차 번호 입력");
			over.trainNumber = in.nextLine();
			System.out.println("기차 시간 입력");
			over.trainTime = in.nextLine();
			for(int i = 0; i < tr; i++) {
				if(tinList[i] == null) {
					tinList[i] = over;
					break;
				}
			}
		}
		// 조회
		public void tinList() {
			for(int i = 0; i < tinList.length; i++) {
				if(tinList[i] != null) {
					tinList[i].prt();
				}
			}	
		}
		//	수정
		public void triMod() {
			System.out.println("기차 번호 입력");
			String newNumber = in.nextLine();
			System.out.println("수정할 기차시간 입력");
			String Event = in.nextLine();
			for(int i = 0; i < tinList.length; i++) {
				if(tinList[i] != null) {
					if(tinList[i].trainTime.equals(Event) && tinList[i].trainNumber.equals(newNumber)){
						System.out.println("수정된 시간을 입력하세요.");
						String newTime = in.nextLine(); 	
						tinList[i].trainTime = newTime;
					}
				}
			}			
		}
	}







