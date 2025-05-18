package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 번호를 나타내는 변수
        String busNumber = "상암 08번";
        // 버스 도착까지 남은 시간을 분 단위로 나타내는 변수
        int remainingTime = 3;
        // 버스 도착까지 남은 거리를 킬로미터 단위로 나타내는 변수
        double remainingDistance = 1.2;
        // 버스 번호를 출력
        System.out.println(busNumber + " 버스");
        // 버스 도착까지 남은 시간 출력
        System.out.println("약 " + remainingTime + "분 후 도착");
        // 버스 도착까지 남은 거리 출력
        System.out.println("남은 거리 " + remainingDistance + "km");

    }
}
