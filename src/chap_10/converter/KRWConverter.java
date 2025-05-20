package chap_10.converter;

import java.sql.SQLOutput;

public class KRWConverter implements Convertible {
    @Override
    public void convert(int USD) {
        // 1달러 = 1400원
        System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
    }




}
