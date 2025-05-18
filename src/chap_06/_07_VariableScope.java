package chap_06;

public class _07_VariableScope {
    public static void mothodA(){
        //System.out.println(number);
    }

    public static void methodB() {
        int result = 3;

        //System.out.println(result);
    }


    public static void main(String[] args) {
        int number = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        //System.out.println(i);
        {
            int j = 0;
            System.out.println(j);
        }

        System.out.println();


    }
}
