package chap_06;

public class _04_ParameterAndReturn {

    public static int getPower(int number){
        return number*number;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(getPower(33));
        System.out.println(getPowerByExp(33,33
        ));

    }
}
