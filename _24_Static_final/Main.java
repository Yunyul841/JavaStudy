package _24_Static_final;

public class Main {
	// 접근 공용변수 리턴타입 메서드명 매개변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		// 스레드(thread)가 코드를 실행한다.
		// 현재 코드를 실행하는 스레드의 여러 정보 중 
		// 스레드의 이름을 가져오라.
		System.out.println(name+"스레드가 1초 뒤에 시작합니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// MemberADM m = new MemberADM();
		// static변수는 공용변수. 위치는 Nethod area
		// 모든 스레드가 고용해서 사용가능 > 즉, 변수값접근가능
		// 객체를 만들지 않고 클래스명과 변수 또는 메서드명으로 접근
		String a = MemberADM.compayName;
		System.out.println(a);
		System.out.println(MemberADM.compayName);
		MemberADM.prt();
		MemberADM.compayName="HOman";
		System.out.println(MemberADM.compayName);
		MemberADM mm = new MemberADM();
		mm.compayName="abc";
		mm.name1 = "a";
		MemberADM mmm = new MemberADM();
		mmm.name1 = "b";
		mmm.compayName="kkk";
		System.out.println(mm.name);
		System.out.println(mm.compayName);
	
//		MemberADM.teamName="kkk";
		// 에러나는 이유?
		// 상수는 초기값이 결정되면 값을 변경이 불가능 하기 떄문에 에러가 난다.
		
		
		
		/* 새로운 스레드를 하나 만들어서 멀티스레드로 운용이 가능
		 Thread t1 = new Thread();
		 t1.setName("taskk1_thread");
		 String tname = t1.getName();
		 System.out.println("새로만든 스레드의 이름은" + tname);
		 */
		 // 상수 :  처음의 결정된 값은 변경이 불가능하다.
		// static : 공용변수이다. 메모리를 같이 쓴다
		// final : 초기값이 설정된 후 바꿀 수 없다.
		
		
		
		
	}
}
