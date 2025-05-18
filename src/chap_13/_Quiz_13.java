package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        String fileName = "src/saying.txt";
        Scanner sc = new Scanner(System.in);
        int correctCount = 0;
        int incorrectCount = 0;

        System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
        System.out.println("-------------------------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            String input;
            int i = 1;


            while(( line = br.readLine() ) != null ) {
               System.out.println("(문제 "+i+")" + line);
               System.out.print("정답 입력 ==> ");
               input = sc.nextLine();
               line = br.readLine();
               if( input.equals(line) ) {
                   System.out.println("정답입니다!!");
                   correctCount++;
               }
               else {
                   System.out.println("틀렸습니다. 정답은 " + line + " 입니다.");
                   incorrectCount++;
               }
               i++;

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("모든 퀴즈가 완료되었습니다.");
        System.out.println("정답 : " + correctCount);
        System.out.println("오답 : " + incorrectCount);
        System.out.println("수고 하셨습니다.");


    }
}
