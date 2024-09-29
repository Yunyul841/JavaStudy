package _10_Class_prac;

import java.util.Scanner;

// 한마리 고양이에 대한 단일 책임의 클래스 정의
public class Cat_Obj {

	String Name = null;
	String Age = null;	
	
	
	public void prt() {
		System.out.println("--- cat info---");
		System.out.println(Name);
		System.out.println(Age);
		
	}

	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}


	// 윤율을 입력하면 윤율 윤율 나오게?
	

	
	
	
	
			
	
	
}
