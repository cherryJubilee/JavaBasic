package ch10;

public class BirthdayTest {

    public static void main(String[] args) {

        Birthday date = new Birthday();

        date.setYear(2019);
        date.setMonth(30);
        date.setDay(14);

        date.showDate();
    }
}