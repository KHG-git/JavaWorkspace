package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능
        // 3. 밑줄(_) 또는 문자로 시작 가능
        // 4 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가(public, static, void, int, double, floa, ...)

        // 입국 신고서 (여행)
        int numberOfAccompanyingFamily = 2; // 동반 가족 수
        System.out.println("numberOfAccompanyingFamily: " + numberOfAccompanyingFamily);

        int durationOfStay = 5; // 체류 기간
        System.out.println("durationOfStay: " + durationOfStay);

        String nationality = "대한민국"; //국적
        System.out.println("nationality: " + nationality);

        String firstName = "현구"; //이름
        System.out.println("firstName: " + firstName);

        String lastName = "강"; // 성
        System.out.println("lastName: " + lastName);

        String dateOfBirth = "1982-12-07"; //생년월일        
        System.out.println("dateOfBirth: " + dateOfBirth);

        String residenceAddress = "서울"; // 체류지
        System.out.println("residenceAddress: " + residenceAddress);

        String purposeOfVisit = "입국목적";
        System.out.println("purposeOfVisit: " + purposeOfVisit);

        String passportNumber = "1234567890";
        System.out.println("passportNumber: " + passportNumber);

        String passportExpirationDate = _06_Constants.PASSPORT_EXPIRATION_YEAR;
        System.out.println("passportExpirationDate: " + passportExpirationDate);

        String flightNumber = "KE123"; // 항공 편명
        System.out.println("flightNumber: " + flightNumber);

        final String CODE = "KR"; // 국가 코드
        System.out.println("CODE: " + CODE);


    }



}
