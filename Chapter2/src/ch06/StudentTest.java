package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Students studentLee = new Students(); //디폴트 생성자
		
		System.out.println(studentLee.showStudentInfo());

		Students studentPark = new Students(12345, "kim", 3);
		
		System.out.println(studentPark.showStudentInfo());

		
	}

}
