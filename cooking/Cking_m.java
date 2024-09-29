package cooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Cking_m {
	ArrayList<Cking_One> klist= new ArrayList<>();
	Cking_One k = new Cking_One();
		
	Cking_m(){
		while(true) {
			menu();
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				ckadd();
			}else if(num == 2) {
				ckset();
			}else if(num == 3) {
				cklist();
			}else if(num == 4) {
				ckdel();
			}else if(num == 5) {
				break;
			}
		}
	}	
	public void menu() {
		System.out.println("1. 등록");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.print("선택>>  ");
		
	}
	

	public void ckadd() { // 등록
		Cking_One k = new Cking_One();
		Scanner in = new Scanner(System.in);
		System.out.println("요리사 이름을 입력하세요");
		k.ckname = in.nextLine();
		System.out.println("요리 이름을 입력하세요");
		k.coking = in.nextLine();
		klist.add(k);
	}
	
	public void ckset() { // 수정
		Cking_One abc = new Cking_One();
		Scanner in = new Scanner(System.in);
		System.out.println("수정할 요리사 이름 입력해주세요");
		String kname = in.nextLine();
		System.out.println("수정할 요리 이름을 입력해주세요");
		String king = in.nextLine();
		System.out.println("변경할 요리사 이름 입력");
		String kkname = in.nextLine();
		System.out.println("변경할 요리 이름 입력");
		String kking = in.nextLine();
		abc.ckname=kkname;
		abc.coking=kking;
		
		for(int i = 0; i < klist.size(); i++) {
				if(klist.get(i).ckname.equals(kname) && klist.get(i).coking.equals(king)) {
					klist.set(i, abc);
					System.out.println("요리사명과 요리가 변경되었습니다");
					break;
				}
			}
		}
	

	public void cklist() { // 조회
		System.out.println("메뉴 모두보기");
		for(int i = 0; i < klist.size(); i++) {
		klist.get(i).prt();	
		}

	}

	public void ckdel() { // 삭제
		Scanner in = new Scanner(System.in);		System.out.println("삭제할 요리사 이름을 입력");
		String aNme = in.nextLine();
		System.out.println("삭제할 요리 입력");
		String aing = in.nextLine();
		for(int i =0; i < klist.size(); i++) {
			if(klist != null) {
				System.out.println("삭제되었습니다");
				if(klist.get(i).ckname.equals(aNme) && klist.get(i).coking.equals(aing)) {
					klist.remove(i);
					break;
				}
			}
		}
	}	
}
