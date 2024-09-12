package _04_Random;

import java.util.Random;
import java.util.Scanner;

public class _03_과제 {

	public static void main(String[] args) {
		// 0번문제
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 한개를 입력하시오!");
		int k = in.nextInt();
		if(k%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		
		System.out.println("-------------");
		System.out.println("숫자 두개를 입력하시오!");
		int k1 = in.nextInt();
		int k2 = in.nextInt();
		int sum = 0;
		sum = k1 + k2;
		System.out.println("합은" + sum + "입니다." );
		
		
		
		Random r = new Random();
		int k3 = r.nextInt(100)+1;
		if(k3 % 7==0) {
			System.out.println(k3);
			System.out.println("행운의 숫자");
		}else {
			System.out.println(k3);
			System.out.println("조심해야하는 숫자");
		}	
		
		for(;true;) {
			int k4 = r.nextInt(100)+1;
			if(k4 % 7==0) {
				System.out.println(k4);
				System.out.println("행운의 숫자");
				break;
			}else {
				continue;
			}
		}
		
				
		}
	}
