package _10_Class_prac;

import java.util.Scanner;

//두번째 클래스는 고양이를 등록, 수정, 삭제, 리스트보기 기능이 있는 관리 클래스
// 고양이 관리 단일 책임을 부여함.
public class Cat_mge {
	// 클래스 바로 안쪽이라서 맴버변수라고 합니다.
	// 여기서 선언한 이유는 클래스 내부 어느곳에서든 참조가능.
	Cat_Obj[] clist = new Cat_Obj[5];
	Scanner in = new Scanner(System.in);
	Cat_mge(){
		while(true) {
			System.out.println("고양이 관리자");
			System.out.println("1. 등록");
			System.out.println("2. 삭제");
			System.out.println("3. 수정");
			System.out.println("4. 전체보기");
			System.out.println("선택 >>");
			int selNum = in.nextInt();	// int selNum 지역변수생성.
			in.nextLine();
			System.out.println(selNum+"을 선택함");
			if(selNum == 1) {
				add(); //	메서드 호출
			}else if(selNum == 2){
				del();
			}else if(selNum == 3) {
				mod();
			}else if(selNum == 4) {
				allList();	// 메서드 호출
		}else {
			break;
			}
		}
	}
	public void mod() { // 수정
		String abc = null;
		System.out.println("수정할 고양이 이름을 입력");
		String anName = in.nextLine();
		System.out.println("수정할 고양이 나이를 입력");
		String anAge = in.nextLine();
		for(int i = 0; i < clist.length; i++) {
			if(clist[i]!= null) {				
			if(clist[i].Name.equals(anName) && clist[i].Age.equals(anAge)) {
				System.out.println("수정할 고양이 이름을 입력하세요");
				clist[i].Name = in.nextLine();
				System.out.println("수정할 고양이 나이를 입력하세요");
				clist[i].Age = in.nextLine();
				break;			
			}
				
			} else {
				System.out.println("정보가 맞지 않습니다");
				break;
			}
			
		}
		
	}
	public void del() { // 삭제
		System.out.println("삭제할 고양이 이름을 입력하세요");
		String deName = in.nextLine();
		System.out.println("삭제할 고양이 나이를 입력하세요");
		String deAge = in.nextLine();
		for(int i = 0; i < clist.length; i++) {
			if(clist[i].Name.equals(deName) && clist[i].Age.equals(deAge)) {
				clist[i] = null;
				break;
			}
		}
		
	}
	public void add() { // 등록
		Cat_Obj aaa = new Cat_Obj();
		System.out.println("고양이 이름을 입력하시오");
		aaa.Name = in.nextLine(); 
		System.out.println("고양이 나이를 입력하시오");
		aaa.Age = in.nextLine();
		
		for(int i = 0; i < clist.length; i++) {
			if(clist[i] == null) {
				clist[i]=aaa;
				break;
			}
		}
	}
	
	public void allList() {	// 전체보기
		for(int i = 0; i < clist.length; i ++) {
			if(clist[i] != null) {
				clist[i].prt();				
			}
		}
	}
}
