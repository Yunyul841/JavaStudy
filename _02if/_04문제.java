package _02if;


public class _04문제 {
	// 문제1
	public static void main(String[] args) {
		double age = 89.2;
		if(age >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	// 문제2
		int level = 2;
		int point = 30;
		if(level == 1) {
			point +=30;
		}else {
			point +=10;
		}
		System.out.println("최종포인트: " + point);
	// 문제3
		int[] lotto = {6,12,33,4,5,26};
		System.out.println(lotto[2] +80);
		
	// 문제4
		int[] lotto1 = {6,12,33,4,5,26};
		 if(lotto1[3]%2==1) {
			 System.out.println("홀수");
		 }else {
			 System.out.println("짝수");
		 }
	
	// 문제5
		 int[] lotto2 = {6,12,33,4,5,26}; // if 가 총 6개
		 int sum = 0;
		 if(lotto2[0]%2==1) {
			sum += lotto2[0];
		 }
		 if(lotto2[1]%2==1) {
			 sum += lotto2[1];
		 }
		 if(lotto2[2]%2==1) {
			 sum += lotto2[2];
		 }
		 if(lotto2[3]%2==1) {
			 sum += lotto2[3];
		 }
		 if(lotto2[4]%2==1) {
			 sum += lotto2[4];
		 }
		 if(lotto2[5]%2==1) {
			 sum += lotto2[5];
		 }
		 System.out.println(sum);
		
		 
		 
	// 문제6
		int[] a = {45,34,64,45,24};
		System.out.println(a[0]+ a[1]+ a[2]+ a[3]+ a[4]);
	}	
}

