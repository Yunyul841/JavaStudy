package _18_ArraList;
import java.util.ArrayList;

public class ListSample {
	ArrayList<String> a = new ArrayList<>();
	public ListSample() {
		System.out.println("리스트의 길이 " + a.size());
		a.add("apple");
		System.out.println("리스트의 길이 " + a.size());
		a.add("banana");
		a.add("abc초콜릿");
		a.add("샌드");
		System.out.println("리스트의 길이 " + a.size());
		System.out.println(a.get(1));
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
			// 모두 출력
		}
		
		System.out.println("------------");
		for(int i = 0; i <a.size(); i++) {
			if(a.get(i).charAt(0)!='a') {
				System.out.println(a.get(i));			
				// a로 시작되는거를 빼고 출력하시오
			}
		} 
		System.out.println("------------");
		a.add(1,"쭈구미");// 특정 인덱스 위치에 추가
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("------------");
		a.remove(3); // 특정 인덱스 삭제
		for(int i = 0; i < a.size(); i++) {
			System.out.println(i+":"+a.get(i));
		}
		System.out.println("-------------");
		a.set(1, "갑오징어"); // 특정인덱스 수정
		System.out.println(a.size());
		for(int i = 0; i < a.size(); i++) {
			System.out.println(i+":"+a.get(i));
		}
		System.out.println("-------------");
		a.clear(); // 리스트 전체 삭제.

		
	}
}
