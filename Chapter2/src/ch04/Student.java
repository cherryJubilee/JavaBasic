package ch04;

public class Student {
	//속성 public 안써도됨
	public int studentID;
	public String studentname;
	public String address;
	
	// 메서드
	public void showStudentInfo() {
		
		System.out.println(studentID + "학번 학생의 이름은 " + studentname + "이고, 주소는 " + address + "입니다.");
	}  

	// 학생의 이름을 호출하는 클래스
	public String getStudentsName() {
		return studentname;
	}	
	
	// 학생의 이름 바꾸는 클래스
	public void setStudentName(String name) {
		studentname = name;
	}
}


