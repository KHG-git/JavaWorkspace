package chap_06;

public class _Quiz_06 {

    public static String getHiddenData(String target, int startPosition){

        String result;

        result =  target.substring(0, startPosition);

        for (int i = startPosition; i < target.length(); i++) {
            result += "*";
        }

        return result;
    }


    public static void main(String[] args) {

        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-1234";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));

    }
}
