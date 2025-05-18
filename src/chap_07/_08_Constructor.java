package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        BlackBox b3 = new BlackBox();
        BlackBox b4 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";

        System.out.println("---------------------------------------");

        BlackBox b2 = new BlackBox("하양이", "UHD", 300000, "화이트");

        System.out.println(b2.getClass());
    }
}
