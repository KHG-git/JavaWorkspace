package chap_12.clean;

public class Room {

    public int number = 1;

    synchronized public void clean(String name){
        // 직원1 : 3번방 청소 완료
        System.out.println(name + " : " +this.number + "번 방 청소 중");
        this.number++;
    }
}
