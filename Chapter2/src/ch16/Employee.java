package ch16;

public class Employee {

    public static int serialNum = 1000; // static: 모든 Employee 객체가 공유
    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {

        serialNum++;
        employeeId = serialNum;
        // 새로운 Employee 객체가 생성될 때마다 직원 ID(Employee ID)를 증가시키기 위한 목적
        // serialNum이 1씩 증가되므로, 각 객체는 서로 다른 ID를 가지게 됩니다.
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        employeeId = employeeId;
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
