package chap_03;

import java.sql.SQLOutput;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and", ","));
        System.out.println(s.substring(7));
        System.out.println(s.substring(s.indexOf("Java")));
        // "Java" 가 시작하는 위치부터 "." 이 시작하는 위치 바로 앞까지
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));

        //공백제거
        s = "       I love Java.       ";
        System.out.println(s.trim());

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(" , ".concat(s2)));


    }
}
