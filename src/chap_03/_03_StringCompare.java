package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s1));
        System.out.println(s1.equals("Java"));
        System.out.println(s1.equals(s2));

        //대소문자 구분없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234";

        System.out.println(s1.equals(s2));
        System.out.println("숫자" + s1.equals("1234"));
        System.out.println(s1==s2);

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
    }
}
