package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break

        int max = 20;
        int noShow = 17;
        int sold = 0;

        for (int i = 1; i < 50; i++) {

            if( i == noShow ){
                System.out.println(i+"번 손님 노쇼로 인해서 다음 손님한테 넘어갑니다.");
                continue;
            }


            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            sold++;

            if ( sold== max ){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            else
            {
                System.out.println("치킨이 " + (max-sold) + "마리 남았습니다.");
                continue;
            }
        }

    }
}
