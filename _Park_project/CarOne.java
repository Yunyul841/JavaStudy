package _Park_project;

public class CarOne {
	String cNumber = null;
	String cFloor = null;
	
	public void cPrt() {
		System.out.println("차번호: " + cNumber + " 주차된 층: " + cFloor);
	}
	public void setcNumber(String cNumber,String cFloor) {
		this.cNumber=cNumber;
		this.cFloor=cFloor;
	}
//	public void setcFloor(String cFloor) {
//	}
	public String getCNumber() {
		return cNumber;
	}
	public String getCFloor() {
		return cFloor;
	}
}
