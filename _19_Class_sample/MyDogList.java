package _19_Class_sample;

public class MyDogList {
	
	
		Dog[] d = new Dog[5];
	
		MyDogList(){
				System.out.println("-- 도그 관리 --");
				System.out.println(d[0]);
				if(d[0]!=null) {
					System.out.println(d[0].name);
				}
				d[1]=new Dog();
				System.out.println(d[1]);
				d[2]=d[1];
				System.out.println(d[2]);
				d[3]=new Dog();
				System.out.println(d[3]);
				Dog dd = new Dog();
		
				d[4]=dd;
				System.out.println(dd);
				System.out.println(d[4]);
				d[1].name="abc";
				System.out.println(d[1].name);
				System.out.println(d[2].name);
				System.out.println(d[3].name);
		
				for(int i=0; i < 5; i++) {
					if(d[i]!=null) {
						System.out.println(d[i].name);
					}
				}
				// 강아지 검색
				String s="땡칠이";
				for(int i=0; i<5; i++) {
					if(d[i]!=null) {
						if(d[i].name.equals(s)) {
							System.out.println("찾음");
							break;
					
				}
			}
		}
//				과제 :
//					프로젝트명 - javaWord
//					컨셉 :
//					영어단어와 해당하는 한글 뜻이 하나의 단어이다.
//					단어를 등록, 전체조회, 삭제(영어단어로 삭제), 수정
//					순으로 프로그램을 개발하시오.
//					단, 단어는  ArrayList에 저장하시오.
//
//					개별미션이고 도움이 필요하시분은 멘토를 찾아서
//					팀을 만드세요~~~
//		
		
		
		
		
		
		
		
		
	}
}
