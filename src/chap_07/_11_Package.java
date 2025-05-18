package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스)
        Random r = new Random();
        System.out.println("랜덤 정수 : " + r.nextInt());
        System.out.println("랜덤 정수 범위 : " + r.nextInt(10));
        System.out.println("랜덤 실수 : " + r.nextDouble());
        //System.out.println("랜덤 실수 범위: " + r.nextDouble());
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 범위: " +(min+(max-min) * r.nextDouble()));

        System.out.println("랜덤 boolean : " + r.nextBoolean());

        //로또 번호를 랜덤으로 뽑으려면?
        System.out.println("로또 번호 : " + (r.nextInt(45)+1));
    }
}
