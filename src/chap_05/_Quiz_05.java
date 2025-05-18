package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int size = 250;
        int[] sizeArray = new int[10];

        for (int i = 0; i < 10; i++) {
            sizeArray[i] = size + i*5;
        }

        for (int i = 0; i < sizeArray.length; i++) {
            System.out.println(sizeArray[i] + " 재고있음");
        }
    }
}
