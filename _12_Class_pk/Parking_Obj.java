package _12_Class_pk;
// 한대의 자동차의 대한 단일 책임의 클래스 정의
public class Parking_Obj {
	
	String name = null;
	int carNum = 0;
	
	public void prt() {
		System.out.println("--- paking info---");
		System.out.println(name);
		System.out.println(carNum);
	}
}
