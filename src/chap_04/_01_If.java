package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 IF
        int hour = 15; //오전 10시
        if(hour < 14)
            System.out.println("아이스 아메리카로 + 1");
        else
            System.out.println("커피 주문 완료");

        hour = 15;
        boolean moningCoffee = false; //모닝커피

        if( hour < 14 && moningCoffee == false)
        {
            System.out.println("아이스 아메리카노 + 1");
        }
        else
        {
            System.out.println("커피 안마셔");
        }
    }
}
