package chap_07;

public class BlackBox {
    String resolution;// 해상도
    int price; //가격
    String color; //색상
    static boolean canAutoReport = false; //자동 신고 기능

    void autoReport(){
        if(canAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type){
        if(type == 1){ //일반 영상
            return 9;
        }
        else if( type == 2) { //이벤트 영상
            return 1;
        }
        return 10;
    }

}
