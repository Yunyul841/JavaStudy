package _21_Pak_Miniproject;

public class CarOne {
	String cNumber = null;
	String cFloor = null;
	
	public void cPrt() {
		System.out.println("차번호: + cNumber" + "주차된 층: + cfloor");
	}
	public void setcNumber(String cNumber) {
		this.cNumber=cNumber;
	}
	public void setcFloor(String cFloor) {
		this.cFloor=cFloor;
	}
	public String getCNumber() {
		return cNumber;
	}
	public String getCFloor() {
		return cFloor;
	}
}
