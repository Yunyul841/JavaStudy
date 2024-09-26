package _22_Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class A_Center {
	ArrayList<A_One> alist = new ArrayList<>();
	Scanner in = new Scanner(System.in);
	A_Center(){
		while(true) {
			System.out.println("1. 등록");
			System.out.println("2. 삭제");
			System.out.println("3. 전체보기");
			System.out.println("4. 수정");
			System.out.println("5. 종료");
			System.out.println("선택 >>");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();				
			}else if(selNum == 2) {
				delect();
			}else if(selNum == 3) {
				alllist();
			}else if(selNum == 4) {
				mod();
			}else if(selNum == 5){
				break;
				
			}
		}
		
	}public int findIdx(String aName, String aAge) {
		return 1;
	}
	public void mod() { // 수정
		A_One aaa = new A_One();
		System.out.println("수정할 이름을 입력하세요");
		String modName = in.nextLine();
		System.out.println("수정할 나이를 입력하세요");
		String modAge = in.nextLine();
		System.out.println("변경할 이름을 입력하세요");
		String chName = in.nextLine();
		System.out.println("변경할 나이를 입력하세요");
		String chAge = in.nextLine();
		aaa.aName=chName;
		aaa.aAge=chAge;
		
		
		for(int i = 0; i < alist.size(); i++) {
			if(alist.get(i).aName.equals(modName) && alist.get(i).aAge.equals(modAge)) {
//				alist.get(i).aName = chName;
				alist.set(i, aaa);
				
			}
		}
		
	}
	public void alllist() { // 전체보기
		System.out.println("동물 모두 보기");
		for(int i = 0; i < alist.size(); i++) {
			alist.get(i).prt();
		}
		
	}
	public void delect() { // 삭제
		System.out.println("삭제할 이름을 입력하세요");
		String SeName = in.nextLine();
		System.out.println("삭제할 나이를 입력하세요");
		String SeAge = in.nextLine();
		for(int i = 0; i < alist.size(); i++) {
			if(alist.get(i).aName.equals(SeName) && alist.get(i).aAge.equals(SeAge)) {
				alist.remove(i);
			}
				
			}
		}
		
	
	public void add() { // 등록
		A_One abc = new A_One();
		System.out.println("동물의 이름을 입력하세요");
//		abc.aName = in.nextLine();
		String aName = in.nextLine();
		System.out.println("동물의 나이를 입력하세요");
//		abc.aAge = in.nextLine();
		String aAge = in.nextLine();
//		alist.add(abc);
		abc.All(aName, aAge);
		int a = findIdx(aName,aAge);
		
	}
}
