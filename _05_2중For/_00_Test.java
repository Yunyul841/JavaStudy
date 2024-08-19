package _05_2중For;

public class _00_Test {

	public static void main(String[] args) {
		for(int i=0; i < 5; i++) {
			System.out.println("1*" + i + "=" + (1*i));
		}
		for(int dan = 0; dan < 5; dan++) {
			System.out.println(dan);
			for(int i = 1; i < 5; i++) {
				System.out.println(dan + "*"+i+"="+(dan*i));
			}
			for(int i = 1; i < 4; i++){			//	줄이 반복되는 for문
				for(int j = 0; j < 3; j++) {	//	*이 3개가 반복되는 for문
					System.out.print("*");		//	문제 분석 후 i를 무엇으로 볼 것인가?
				}								//           j를 무엇으로 볼 것인가?
				System.out.println();			//	i의변화에 따라 j가 반복괸다.
			}
			System.out.println("-----");
			for(int k = 0; k < 4; k++) {
				for(int L = 0; L <= k; L++) {
					System.out.print("*");
				}
				System.out.println();
			}
			String id = "abc*";
			String sign = "*^$";
			int cnt = 0;
			for(int y = 0; y < sign.length(); y++) {
				for(int z = 0; z < id.length(); z++) {
					if(sign.charAt(y)==id.charAt(z)) {
						cnt++;
					}
				}
			}
			if(cnt > 0);
			System.out.println("특수문자 포함");
		}

	}

}
