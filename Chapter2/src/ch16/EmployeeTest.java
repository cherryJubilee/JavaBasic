package ch16;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeePark = new Employee();
        employeePark.setEmployeeName("박혜원");

        System.out.println(Employee.serialNum);

        Employee employeeKIm = new Employee();
        employeeKIm.setEmployeeName("김가나");

        System.out.println(Employee.serialNum);

        System.out.println(employeePark.getEmployeeName() +"님의 사번은 " + employeePark.getEmployeeId() +"입니다.");
        System.out.println(employeeKIm.getEmployeeName() +"님의 사번은 " + employeeKIm.getEmployeeId() +"입니다.");

    }

}
