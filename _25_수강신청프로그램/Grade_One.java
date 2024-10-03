package _25_수강신청프로그램;

public class Grade_One {
	private String name = null;
	private String id = null;
	private String phonenum = null;
	private String grade = null;
	 
	public void prt() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 아이디 : " + id);
		System.out.println("학생 전화번호 : " + phonenum );
		System.out.println("학생 학년 : " + grade);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
