package _25_수강신청프로그램;

public class log_One {
	String email = null;
	String password = null;
	
	public void prt3() {
		System.out.println("이메일	: "+ email);
		System.out.println("비밀번호	:"+ password);
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
