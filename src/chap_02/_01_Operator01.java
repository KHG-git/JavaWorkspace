package chap_02;

import java.util.Arrays;

public class _01_Operator01 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4+2);
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(4/2);
        System.out.println(5/2);
        System.out.println(2/4);
        System.out.println(4%2);
        System.out.println(5%2);

        // 우선 순위 연산
        System.out.println(2+2*2);
        System.out.println((2+2)*2);
        System.out.println(2+(2*2));

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);
        System.out.println(++val);  //11
        System.out.println(val);  //11

        System.out.println("---------------------------");

        val = 10;
        System.out.println(val);  //10
        System.out.println(val++);  //10
        System.out.println(val);  //11

        System.out.println("================================");

        val = 10;
        System.out.println(val);  //10
        System.out.println(--val);  //9
        System.out.println(val);  //9


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        val = 10;
        System.out.println(val);  //10
        System.out.println(val--);  //10
        System.out.println(val);  //9

        System.out.println("-------은행대기번호표-----------");
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3


    }
}
