package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 변경 (수강권 양도)

        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0, "이수근");
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println("---------------------------------");

        // 확인
        System.out.println(list.indexOf("김종국"));

        // 선착순 5명 내에 포함되었는가?
        if(list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        }
        else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("---------------------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("---------------------------------");

        // 다음 학기에 새로 공부 시작

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 정렬
        Collections.sort(list);

        System.out.println(list);

        for ( String s : list){
            System.out.println(s);
        }


    }
}

