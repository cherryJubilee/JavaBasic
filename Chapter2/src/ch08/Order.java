package ch08;

public class Order {
    public String OrderNumber;
    public String customerPhone;
    public String customerAddress;
    public String orderDate;
    public String orderTime;
    public int price;
    public String menuId;

    public void showOrderDetail() {

        System.out.println("주문 접수 번호: " + OrderNumber);
        System.out.println("주문 핸드폰 번호: " + customerPhone);
        System.out.println("주문 집 주소: " + customerAddress);
        System.out.println("주문 날짜: " + orderDate);
        System.out.println("주문 시간: " + orderTime);
        System.out.println("주문 가격: " + price);
        System.out.println("메뉴 번호: " + menuId);
    }
}
