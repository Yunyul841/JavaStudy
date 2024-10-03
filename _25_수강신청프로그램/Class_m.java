package _25_수강신청프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Class_m {
	ArrayList<Subjects_One> jlist = new ArrayList<>();
	public void yul() {
		Scanner in = new Scanner(System.in); 
		while(true) {
			menu();
			String qqq = in.nextLine();
			if(qqq.equals("1")){
				add();
			}else if(qqq.equals("2")) {
				allList();
			}else if(qqq.equals("3")) {
				break;	
			}
		}
	}
	public void menu() {
		System.out.println("1. 등록");
		System.out.println("2. 전체 확인");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
	}
	private void add() {
		Scanner in = new Scanner(System.in);
		Subjects_One abc = new Subjects_One();
		System.out.println("신청할 과목을 입력하세요");
		String Subjectname = in.nextLine();
		abc.setSubjectname(Subjectname);
		System.out.println("신청할 강의실을 입력하세요");
		String classroom = in.nextLine();
		abc.setClassroom(classroom);
		System.out.println("원하시는 교수님을 입력하세요");
		String teacher = in.nextLine();
		abc.setTeacher(teacher);
		jlist.add(abc);
	}
	private void allList() {
		for(int i = 0; i < jlist.size(); i++) {
			jlist.get(i).prt1();
		}
	}
	
}
