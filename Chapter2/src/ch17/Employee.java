package ch17;

public class Employee {
    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee()
    {
        serialNum++;
        employeeId = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }
    // 인스턴스 생성과 상관없이 클래스 이름으로 바로 호출 가능
    public static void setSerialNum(int serialNum) {
        int i = 0;                           // 지역 변수

        //	employeeName = "Lee";  //오류발생  // 인스턴스 변수
        Employee.serialNum = serialNum;     // static 변수
    }

    public int getEmployeeId() {
        serialNum = 1000; // 로드 될 때 메모리가 이미 존재하는 상태 -> 일반 메서드에서 static 변수 사용 가능하다
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

}