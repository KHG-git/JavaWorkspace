package chap_06;

public class _02_Parameter {

    public static int power(int number){
        return number*number;
    }
    
    public static int powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        // 전달값 , Parameter
        // 2 -> 2*2 = 4

        System.out.println(power(2));
        System.out.println(power(3));

        System.out.println("-----------------------------------");

        System.out.println(powerByExp(2,3));
        System.out.println(powerByExp(5,4));
        System.out.println(powerByExp(10,   4));


    }
}
