package _25_수강신청프로그램;

public class Subjects_One {
	private String classroom = null;
	private String teacher = null;
	private String Subjectname =null;
	 
	public String getSubjectname() {
		return Subjectname;
	}
	public void prt1() {
		System.out.println("과목명	: " + Subjectname);
		System.out.println("강의실	: " + classroom);
		System.out.println("담당교수님	: " + teacher );
	}

	public void setSubjectname(String subjectname) {
		Subjectname = subjectname;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	
	
}
