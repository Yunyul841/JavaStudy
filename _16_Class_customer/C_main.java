package _16_Class_customer;

import java.util.Scanner;

public class C_main {

	public static void main(String[] args) {
		while(true) {
			System.out.println("1. 고객");
			System.out.println("2. 이벤트");
			Scanner in = new Scanner(System.in);
			int aaa = in.nextInt();
			in.nextLine();
			if(aaa == 1) {
				C_center cust = new C_center();	
			}else if(aaa == 2) {
				E_center qwer = new E_center();				
			}else {
				System.out.println("끝");
				break;
			}
			
					
		
		}
		
		
		}
}
