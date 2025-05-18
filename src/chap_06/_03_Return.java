package chap_06;

public class _03_Return {

    // 호텔 전화번호
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-1234";
        return  phoneNumber;
    }

    // 호텔 주소
    public static String getAddress(){
        return "서울시 종로구 센트로폴리스";
    }

    // 호텔 액티비티
    public static String getAcitivity(){
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {

        String contactNumber = getPhoneNumber();
        String address = getAddress();
        String activity = getAcitivity();

        System.out.println(contactNumber);
        System.out.println(address);
        System.out.println(activity);
    }
}
