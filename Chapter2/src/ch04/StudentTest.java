package ch04;

public class StudentTest {

	public static void main(String[] args) {
		// 생성된 클래스를 이용한 참조변수(studentLee) typ은 Student 생성자는 Student()
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남";
		
		studentLee.showStudentInfo();

		
		Student studentPark = new Student();
		
		studentPark.studentID = 34567;
		studentPark.setStudentName("Park");
		studentPark.address = "경기도";
		
		studentPark.showStudentInfo();
		
		//heep에 할당된 메모리 가상주소
		System.out.println(studentLee);
		System.out.println(studentPark);

		
		
	}
}
