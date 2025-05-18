package chap_07;

import chap_07.Camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // int, float, double, long, boolean
        int [] i = new int [3];
        System.out.println(i[0]);

        double [] d = new double[3];
        System.out.println(d[0]);

        // 참조 자료형(Non-Primitive, Reference Data Types) : String, Camera, FactoryCam
        String [] s = new String[3];
        System.out.println(s[0]);

        Camera[] c = new Camera[3];
        System.out.println(c[0]==null);

        /// ////////////////////////////////////////
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 390;
        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------------------------------");

        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        c2 = c1;

        System.out.println(c1.name);
        System.out.println(c2.name);

        c2.name = "고장난카메라";

        System.out.println(c1.name);
        System.out.println(c2.name);

        changName(c1);
        changName(c2);

        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = null;

        c2 = new Camera("새로운 카메라");

        System.out.println(c1.name);
        System.out.println(c2.name);

    }

    public static void changName(Camera camera){
        camera.name = "잘못된 카메라";
    }
}

