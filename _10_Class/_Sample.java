package _10_Class;
import java.util.Random; // 렌덤이라는 패키지 클래스
public class _Sample {  // __Sample 라는 클래스

	public static void main(String[] args) {
		//변수 : 값을 저장하는 기억공간, 메모리저장
		//변수 원시변수,참조변수
		// 클래스 구성요소 → 맴버변수, 메서드
		// 원시변수는 실제 값을 표현(저장)
		// 참조변수는 객체의 주소를 저장, 객체를 참조하기 위한 주소
		// 객체는 힙영역에 있다.
		// new연산자는 객체를 만드는 것
		// ()가 있으면 생성자
		// .은 참조 연산자
		// 객체를 공유한다는 의미
		// 객체의 주소값의 숫자를 넣으면 오류가 뜬다.
		// 원시변수는 실제 값 내가 원하는 값
		// 참조변수는 내가 원하는 값이 있는 주소를 저장
		// 변수가 원시변수인지 참조변수인지 확인 필수
		int a = 10; // int는 4byte  // 원시변수
		Random r = new Random(); // 참조변수   객체를 직접만든 코드
		Random r1 = r;	// 참조변수		이미 만들어진 주소를 받아 쓰는 것
		Random r2 = null; // 참조변수
		Random r3 = new Random(); // 참조변수 
		System.out.println(r.nextInt(4));
		System.out.println(r1.nextInt(4));
		System.out.println(r2.nextInt(4));
		System.out.println(r3.nextInt(4));
		// 첫번쨰 클래스와 객체를 구분
		// 클래스를 정의하고 객체를 만든다.
		// 객체를 만들 떄 new연산자를 사용
		// 예외 3번 객체를 참조할 변수가 없어서 
		
	}

} 
		