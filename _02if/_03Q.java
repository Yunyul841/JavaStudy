package _02if;

import java.io.OutputStream;

public class _03Q {

	public static void main(String[] args) {
		/*
		 * 수강관리 프로젝트를 진행한다.
		 * 학생이 정보는 이름 학번 나이 성적이다.
		 * 나이가18세 미만은 수강신청을 할 수 없다.
		 * 성적이60점 이상이면서 70점 미만인 학생은 수강 신청을 할 수있지만
		 * 이름 뒤에 별표를 추가한다.
		 * 이름 뒤에 별표를 추가한다.
		 * 90점 이상이면 a
		 * 80점 이상이면 b
		 * 70점 이상이면 c	
		 * 60점 이상이면 d
		 * 60점 미만이면 F라고 출력한다.
		 */
		String name = "윤율";
		String started = "20240807";
		int age = 20;
		int Grades = 65;
		
		
		
		
		
//			문제 a와 b는 도로의 길이이며 위치이다.
//			my는 나의 위치이다
//			내가 도로위에 있으면 도로위.. 도로위가 아니라면 도로가아님이라고 출력하시오.
		  int a = 10;
		  int b = 20;
		  int my = 15;
		 
		  
//		  up1 
//		  만약 내가 도로위라면
//		  a 지점으로 부터 5(my위치에 따라 달라짐)만큼 떨어져 있습니다 라고 출력하시오.
		  if( a <= my && my <= b) {
			  System.out.println("도로 위");
		  }else {
			  System.out.println("도로가 아님");
		  }
		  
		  
		  
		  
		  
//		  up2
//		  up1에서 현재 my의 위치가 가까운 쪽 기준으로 출력한다
//		  예를 들어 my 18이면 b에 더 가까우니 b에서 부터 2거리 떨어져 있습니다.
		
		
	}

}
