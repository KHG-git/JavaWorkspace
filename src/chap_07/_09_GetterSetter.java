package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        //b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        b1.price = -5000;
        System.out.println("가격 : "+b1.price+" 원");

        //고객문의
        System.out.println("해상도 : "+b1.resolution);

        System.out.println("=====================================");

        BlackBox b2 = new BlackBox();
        b1.setModelName("하양이");
        //b1.resolution = "FHD";
        b1.setPrice(-3000);
        b1.setColor("화이트");

        System.out.println("가격 : "+b1.getPrice()+" 원");
        System.out.println("해상도 : "+b1.getResolution());
    }
}
