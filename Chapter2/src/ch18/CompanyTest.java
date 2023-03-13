package ch18;

public class CompanyTest {

    public static void main(String[] args) {

        Company company1 = Company.getInstance();  // 인스턴스를 만들지 않고(new x) 바로 사용 가능하기 위해 static 메서드로 제공
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);
        // company는 외부에서 생성될 수 없고, 내부에는 private로 하나 생성되어 있고 getInstance 메서드만을 통해 사용할 수 있다.
    }
}
