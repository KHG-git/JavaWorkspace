package chap_12;

import chap_12.clean.CleanThread;

import static java.lang.Thread.sleep;

public class _01_Thread {
    public static void main(String[] args) {
        // 하나의 프로세스 (Process)
        // 쓰레드 (Thread)

        // 1 3 5 7 9
        // 2 4 6 8 10
        //cleanBySelf();

        CleanThread cleanThread = new CleanThread();
        //cleanThread.run(); //직원청소
        cleanThread.start();
        cleanByBoss();
    }

    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");

        }
        System.out.println("(혼자) 청소 끝");
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10 ; i+=2) {
            System.out.println("(사장) " + i + "번방 청소 중");
//            try {
//                sleep(1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

        }
        System.out.println("(사장) 청소 끝");
    }
}
