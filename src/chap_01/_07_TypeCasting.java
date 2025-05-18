package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println("Outputs the value after implicit typecasting from int to double:");
        System.out.println(b); // Outputs the value after implicit typecasting from int to double

        // 형변환 TypeCasting
        int c = (int)b;
        System.out.println("Outputs the value after explicit typecasting from double to int:");
        System.out.println(c); // Outputs the value after explicit typecasting from double to int

        int score = 93;
        System.out.println("Outputs the score as a string:");
        System.out.println("Score: " + score); // Outputs the score as a string
        System.out.println("Outputs the score as a float value:");
        System.out.println((float) score); // Outputs the score as a float value
        System.out.println("Outputs the score as a double value:");
        System.out.println((double) score); // Outputs the score as a double value

        score = 93 + (int) 98.8;
        //출력
        System.out.println("score = 93 + (int) 98.8 : " + score);

        double score_d = 93 + 98.8;
        System.out.println("score_d = 93 + 98.8 : " + score_d);

        double convertedScoreDouble = score+score_d;
        int convertedScoreInt = (int)score_d+(int)score;
        System.out.println("convertedScoreDouble = " + convertedScoreDouble);
        System.out.println("convertedScoreInt = " + convertedScoreInt);

        System.out.println("//숫자를 문자열로 // Convert numbers to strings.");
        String s1 = String.valueOf(93);
        String s2 = String.valueOf(98.8);
        String s3 = String.valueOf(100.1);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.out.println("// 문자열을 숫자로 // Convert strings to numbers using Integer.parseInt() and Double.parseDouble().");
        int i1 = Integer.parseInt("93");
        double d1 = Double.parseDouble("98.8");
        System.out.println("i1 = " + i1);
        System.out.println("d1 = " + d1);

        try {
            System.out.println("// Error handling: Trying to parse a non-numeric string into an integer.");
            int error = Integer.parseInt("abc");
            System.out.println("error = " + error);
        } catch (NumberFormatException e) {
            System.out.println("Parsing error! 'abc' cannot be converted to an integer.");
        }
    }
}
