package chap_01;

import java.util.Arrays;

public class _03_Variables {
    public static void main(String[] args) {

        String name = "나도코딩";
        int hour = 15;
        double score = 90.5;
        char grade = 'A';
        boolean pass = true;

        double d = 3.14123456789;
        float f = 3.14123456789F;

        long l = 1000000000000l;
        l = 1_000_000_000_000L;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour +"시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료 되었습니다.");

        name = "강백호";

        System.out.println(name + "님의 평균 정수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다");

        System.out.println("이번 시험에 합격했을까요? " + pass);

        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
    }
}

