package chap_07;

import java.util.HashMap;

public class _Quiz_07 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("-------------------------------");
        for ( HamBurger h : hamBurgers) {
            h.cook();
            System.out.println("-------------------------------");
        }

        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}
/*
양상추
패티
피클

+치즈

+새우
 */
class HamBurger{

    protected String name;
    protected String material = "> 양상추 \n + 패티 \n + 피클 \n";

    public HamBurger() {
        this("햄버거");
    }

    public HamBurger(String name) {
        this.name = name;
    }

    public void cook(){
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println(this.material);
    }

    public String getMaterial() {
        return material;
    }
}

class CheeseBurger extends HamBurger{

    public CheeseBurger() {
        super("치즈버거");
        this.material = super.getMaterial() + " + 치즈";
    }

    public void cook(){
        super.cook();
        System.out.println("CheeseBurger finished");
    }
}

class ShrimpBurger extends HamBurger{
    public ShrimpBurger() {
        super("새우버거");
        this.material = super.getMaterial() + " + 새우";
    }

    public void cook(){
        super.cook();
        System.out.println("ShrimpBurger finished");
    }
}