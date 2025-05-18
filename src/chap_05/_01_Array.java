package chap_05;

import java.util.Arrays;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형으 값 여러개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");

        // 배열 선언 첫벙째 방법
        String[] coffees = new String[4];

        //두번째 방법
        //String coffees2[] = new String[4];

        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";

        String [] coffees3 = new String [] {"아메리카노","카페모카" , "라떼", "카푸치노" };

        System.out.println(Arrays.toString(coffees3));

        String [] coffees4 = {"아메리카노","카페모카" , "라떼", "카푸치노" };

        System.out.println(Arrays.toString(coffees4));

        coffees4[2] = "에소프레소";
        System.out.println(coffees4[0]+ " 하나");
        System.out.println(coffees4[1] + " 하나");
        System.out.println(coffees4[2] + " 하나");
        System.out.println(coffees4[3] + " 하나");

        int [] i = {1,3,5,7,9};

        System.out.println(Arrays.toString(i));

    }
}
