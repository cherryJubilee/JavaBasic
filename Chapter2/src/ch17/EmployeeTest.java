package ch17;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() + "," + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "," + employeeKim.getEmployeeId());

        System.out.println(Employee.getSerialNum());  //인스턴스 생성과 무관하게 바로 메소드가 수행될 수 있도록 getSerialNum 메소드안에 요소들은 모두 메모리를 가지고 있어야됨.
    }                                                 // 따라서 인스턴스 변수는 사용될 수 없다.
}