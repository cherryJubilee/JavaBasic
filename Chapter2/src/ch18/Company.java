package ch18;

public class Company {   // 회사는 유일해야됨 -> 생성자를 만들지 않는다면? 디폴트 생성자가 생성되고, 외부에서 마구잡이로 만들지 않도록 하기.

    private static Company instance = new Company();     // 유일한 객체(instance) 만들기

    private Company() {
    }

    public static Company getInstance() {
        if(instance == null) {           // 방어적인 코드
            instance = new Company();
        }
        return instance;
    }
}
