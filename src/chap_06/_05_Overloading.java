package chap_06;

public class _05_Overloading {

    public static int getPower(int number){
        return number*number;
    }

    public static int getPower(String strNumber){
        int result = Integer.parseInt(strNumber);
        return result*result;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 1. 전달값의 타입니 다르거나
        // 2. 전달값의 갯수가 다르거나
        System.out.println(getPower(3));
        System.out.println(getPower("5"));
        System.out.println(getPower(3,5));
    }
}


