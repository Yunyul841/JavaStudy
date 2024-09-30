package _17_method;

public class TestMethod {
	// 생성자는 눈에 안보이만 생략이 되어있다.
	
	// 이름뒤에 마스킹을 해 주는 메서드 만들기.
	// 호출할 떄 문자열로 마스킹 문자를 지정하면,
	// 이름뒤에 마스킹 문자를 연결하여 리턴한다.
	// 메서드명은 maskName
	
	public String maskName(String masking) {
		String maskingName = name+masking;
		return maskingName;
	}
	
	int age = 0;
	public int aaa(int a) {
		int abc = age+a;
		return abc; 
	}
	
	String name2 = "킹왕짱";
	public String bbb(String c) {
		String qwer = name2+c;
		return qwer;
				
	}
	int Age1 = 0;
	public int t(int g) {
		int nnn = Age1+g;
		return nnn;
	}
	int ob = 0;
	public int hhh(int c) {
		int uu = ob + c;
		return uu;
	}
	String sb = null;
	public String jk (String  q) {
		String asd = sb + q;
		return asd;
	}
	String Nm = null;
	public String qq(String h) {
//		h = Nm+h;
//		String z = Nm + h;
		Nm += h;
		return Nm;
	}
	
	
	
	String name = null;
	public String getName2(String pwd) {
		if(pwd.equals("1111")) {
			return name;
		}else {
			return null;
		}
	}
	public void setAge(int a) {
		age=a;
	}
	public void setName2(String Name ) {
		name= Name;
	}
	public void setName(String n) {	
		name=n;
	}
	public void setNum(String t) {
		Nm = t;
	}
	public void setAge1(int g) {
		Age1=g;
	}
	public void setAge2(int num) {
		ob = num; 
	}
	public void setName4(String g) {
		sb = g;
	}
	public String getName() {
		return name;
	}
}
