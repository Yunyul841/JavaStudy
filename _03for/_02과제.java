package _03for;

public class _02과제 {

	
	public static void main(String[] args) {
		//1번
		for(int i =100; i < 1000; i++) {
			if(i % 2 == 1) {
				
				System.out.println(i);
			}
		}
		System.out.println("------------");
		
		
		//2번
		int a =0;
		for(int i = 0; i <=100; i++) {
			if(i % 2 == 1) {
				a += i;
			}
		}
		System.out.println(a);
		System.out.println("------------");
		
		//3번
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("------------");
		//4번 
		  int[] arr = {45,23,25,64,3,24,48};
		  for(int i = 0; i < 7; i++) {
			  if (arr[i]% 2 == 0) {
				  
				  System.out.println(arr[i]);
			  }
		  }
		  System.out.println("--------------");
		 //7번
		  int sum = 0;
		  for(int i = 0; i <7; i++) {
			  sum += arr[i];
		  }
		  System.out.println(sum);
		  
		  //8번
		  int c =0;
		  for(int i =0; i<7; i++) {
			  if(arr[i]%2==0) {
				  c++;
			  }
		  }
		  System.out.println("--------------");
		  System.out.println(c);
		  
		  //12번
		  int[] arr1 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		  int cnt =0;
		  int maxlnegth = 0;
		  for(int i =0; i<arr.length; i++) {
//			  System.out.println("현재번호" + arr1[i]);
			  if(arr1[i]==0) {
				  cnt++;
			  } else { cnt =0;}
			  if(cnt > maxlnegth) {
				  maxlnegth = cnt;
			  } 
		  }
		  System.out.println(maxlnegth);
//			  System.out.println(i+"/"+cnt);
		  //13번
		  int[] arr2 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		  int cnt1 =0;
		  int bT = arr[0];
		  for(int i =  0; i<arr.length; i++) {
			  if(arr[i]==bT ) {
			  }else {cnt1 =1;}
				  
			  System.out.println(i+"/"+cnt1);
			  }
		  //9번
		  int cnt2 =0;
		  String test = "abcdeabce";
		  for(int i =0; i < 9; i++) {
			  char aaa= test.charAt(i);
			  if(aaa =='a') {
				  cnt2++;
			  }
		  }
		  System.out.println(cnt2);
		
		  String ttt = new String("aabbcccaaaaddbbbaaaaa");
		  int cnt3 =0; String resultZip=""; char bt = ttt.charAt(0);
		  int maxCnt =0; int maxNumber=0;
		  for(int i =0; i < ttt.length(); i++) {
			  if (bT== ttt.charAt(i)) {
				  cnt3++;
			  }else {
				  resultZip = resultZip + (char) bT + cnt;
			  }
			  }
	}
}


