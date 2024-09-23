package _15_Class_level_1;

public class T_mian {

	public static void main(String[] args) {
		//	TODO Auto-generated method stub
		//	T_Mian이 T_Center을 의존하기 떄문에 변수가 필요
		//	tcenter라는 변수 생성
		//	참조가 불가능 
		//	이유 : 의존관계는 있지만 참조하기 위해선 객채의 주소가 있어야하는데
		//	값이 null 이기 떄문에
		//	주소를 만들려면 new 연산자 사용	
		//	누군가로부터 객체의 주소값을 가져오면 된다.
		//	맴버변수라는 배열을 만들었다.
		//	T_Center tcenter1 = tcenter; 	주소를 주입받아서 참조했다.
		T_Center tcenter = new T_Center();	// 직접주소를 만들어서 참조했다.
								// 생성자
									// 객체를 만들 떄 제일먼저 실행..
	}

}
