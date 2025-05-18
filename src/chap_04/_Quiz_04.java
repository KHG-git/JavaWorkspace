package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차요금
        int feePerHour = 4000; // 시간당 4,000원
        int maxFeePerDay = 30000; // 일일 최대 요금 30,000원
        double discount = 0.5; //경차 또는 장애인 차량 50% 할인

        int parkingHour = 20;
        boolean isSmallCar = false; //경차 여부
        boolean withDisablePerson = true; //장애인 차량 여부

        int finalFee = parkingHour * feePerHour;

        // 30,000원 초과시 일 최대 요금으로 수정
        if ( finalFee > maxFeePerDay )
            finalFee = maxFeePerDay;

        if ( isSmallCar || withDisablePerson)
            finalFee *= discount;

        System.out.println("최종 요금은 " + finalFee + " 입니다.");
    }
}
