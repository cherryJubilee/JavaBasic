package ch15;

public class TakeTransTest {

    public static void main(String[] args) {
        Student studentPark = new Student("Edward", 20000);
        Taxi wellTaxi = new Taxi("잘나간다 운수");

        studentPark.takeTaxi(wellTaxi);

        studentPark.showInfo();
        wellTaxi.showTaxiInfo();

    }
}
