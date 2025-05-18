package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트 : 중복 불가
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("삼겹살");
        set.add("후추");
        set.add("깻잎");
        set.add("삼겹살");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 : " + set.size());

        // 순회
        for ( String s : set) {
            System.out.println(s);
        }

        System.out.println("----------------------------");

        if ( set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }

        System.out.println("----------------------------");

        System.out.println("총 구매 상품 수 (삼겹살 구매 전) : " + set.size());
        set.remove("삼겹살");
        System.out.println("총 구매 상품 수 (삼겹살 구매 후) : " + set.size());

        System.out.println("----------------------------");

        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 구매 상품 수 : " + set.size());
            System.out.println("집으로 출발");
        }

        System.out.println("----------------------------");

        // 세트 : 중복 허용 X, 순서 보장 X
        //HashSet<Integer> intSet = new LinkedHashSet<>();
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(22);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);

        for (int i : intSet) {
            System.out.println(i);
        }

    }
}
