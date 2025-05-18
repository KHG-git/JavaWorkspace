package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        /*
           석차에 따른 장학금 지급

           1등 : 전액
           2등 : 반액
           3등 : 30%
           4등 : 30%
           그외 : 장학금 대상 아님
        */

        int ranking = 4;

        switch(ranking)
        {
            case 1:
                System.out.println("전액");
                break;
            case 2:
                System.out.println("반액");
                break;
            case 3:
            case 4:
                System.out.println("30%");
                break;
            default :
                System.out.println("장학금 면제");

        }


        int grade = 3; //등급
        int price = 7000; //기본 가격
        switch(grade)
        {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }

        System.out.println(grade + "등급 제품의 가격 : " + price + "원");

    }
}
