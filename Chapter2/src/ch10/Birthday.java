package ch10;

public class Birthday {
    private int day;
    private int month;
    private int year;
    private boolean isValid;   // 디폴트는 false


    //set -> 객체의 멤버변수에 접근 제한
    public void setDay(int day) {
        this.day = day;
    }

    //set
    public void setMonth(int month) {

        if ( month < 1 || month > 12) {
            isValid = false;
        }
        else {
            this.month = month;
            isValid = true;
        }
    }

    public void setYear(int year) {

        this.year = year;
    }

    public void showDate() {
        if(isValid) {  //true 일 때
            System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
        }
        else {
            System.out.println("유효하지 않은 날짜 입니다.");
        }
    }
}
