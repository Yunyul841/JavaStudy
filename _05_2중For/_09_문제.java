package _05_2중For;

public class _09_문제 {

	public static void main(String[] args) {3
		 String ttt ="aabbbcccaaaaddbbbaaaaa";
		int maxcnt = 0;
		int cnt = 0;
		char maxchar =0;
		char nowchar =0;
		
		for(int i =0; i < ttt.length(); i++) {
			nowchar = ttt.charAt(i);
			for(int j = i; j < ttt.length(); j++) {
				if(ttt.charAt(j)!= nowchar) {
					break;
				}else {
					cnt++;
				}
			}
			if(maxcnt < cnt) {
				maxcnt=cnt; 
				maxchar=nowchar;
			}
		}

	}

}
