package _11_class_Ex;

import java.util.Scanner;

//두번째 클래스는 고양이를 등록, 수정, 삭제, 리스트보기 기능이 있는 관리 클래스
// 고양이 관리 단일 책임을 부여함.
public class Cat_m {
	// 클래스 바로 안쪽이라서 맴버변수라고 합니다.
	// 여기서 선언한 이유는 클래스 내부 어느곳에서든 참조가능.
	Cat_Obj[] clist = new Cat_Obj[5];
	Scanner in = new Scanner(System.in);
	Cat_m(){
		while(true) {
			System.out.println("고양이 관리자");
			System.out.println("1. 등록");
			System.out.println("2. 삭제");
			System.out.println("3. 수정");
			System.out.println("4. 전체보기");
			System.out.println("선택 >>");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum+"을 선택함");
			if(selNum == 1) {
				add(); //	메서드 호출
			}else if(selNum == 2){
				
			}else if(selNum == 3) {
				
			}else if(selNum == 4) {
				allList();	// 메서드 호출
		}else {
			break;
			}
		}
	}
	public void add() {	//	메서드 정의
		// 클래스 내부에 선언한 변수를 지역변수
		// 클래스가 종료되면 변수는 사라진다.
		// Scanner in = new Scanner(System.in); // 키보드로 입력받을려고 선언함
		System.out.println("고양이 등록");
		// 새로운 고양이 만들어야죠..
		Cat_Obj cat = new Cat_Obj();
		System.out.println("고양이 이름을 입력");
		cat.name = in.nextLine();
		
		for(int i = 0; i < clist.length; i++) {
			if(clist[i] == null) {
				clist[i]=cat;
				break;
			}
		}
	}
	// in.close();
	public void allList() {	//	메서드 정의
		System.out.println("고양이 전체 보기");
		for(int i = 0; i < clist.length; i++) {
			if(clist[i] != null) {
				clist[i].prt();
			}
		}
	}
}
