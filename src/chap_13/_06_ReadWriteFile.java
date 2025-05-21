package chap_13;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader : 파일에서 내용을 읽어올 때
        // BufferedWriter : 파일에 내용을 쓸 때

        String fileName = "goodjob.txt";

        // 파일 쓰기
        //FileWriter fw = new FileWriter("goodjob.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
//            bw.write("1. 이제 거의 끝이 보여요.");
//            bw.newLine();
//            bw.write("2. 여기까지 오신 여러분들 정말 대단해요!");
//            bw.newLine();
//            bw.write("3. 조금만 더 힘내요");
//            bw.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while(( line = br.readLine() ) != null ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}


