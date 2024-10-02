package _23_접근제어자_01;

import _23_접근제어자_02.MemberOne;

public class Main {

	public static void main(String[] args) {
		// dafault → Package내에서 접근가능
		// public → 어디서든 접근 가능(Package, class전부가능)
		// private → Class내에서만 접근가능
		// TODO Auto-generated method stub
		MemberOne m = new MemberOne();
//		m.name = "hong";	// err why? name변수 접근제어자가 default
		m.prt();	// 가능
		m.setName("1234");
		m.setName("5678");
		m.setName("윤율");

		
	}
}


//접근제어자 메서드 접근을 제어하는 것
