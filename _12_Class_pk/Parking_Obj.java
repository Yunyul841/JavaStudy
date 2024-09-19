package _12_Class_pk;
// 한대의 자동차의 대한 단일 책임의 클래스 정의
public class Parking_Obj {
	
	String name = null;
	String carNum = null;
	String number = null;
	
	public void prt() {
		System.out.println("--- paking info---");
		System.out.println("소유자 이름 :"+ name);
		System.out.println("소유자 전화번호 :"+number);
		System.out.println("자동차 번호 :"+carNum);
	}
}
