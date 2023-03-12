package ch06;

public class Students {
	
	//생성자
	public int studentNumber;
	public String studentName;
	public int grade;
	
	// 디폴트 생성자
	public Students() {}
	// 그냥 생성
	public Students(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	// 메서드
	public String showStudentInfo() {
		return studentName + "학생의 학번은" + studentNumber + "이고, " + grade + "학년 입니다";
	}
}
