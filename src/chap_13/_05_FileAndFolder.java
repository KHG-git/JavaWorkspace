package chap_13;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.IOException;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        //String folder = "E:\\JavaWorkspace\\src\\chap_13"; //현재 위치
        String folder = "src";
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());

        listAndFiles(filesAndFolders.listFiles());

    }

    public static void listAndFiles(File[] f) {
        for(File file : f ) {
            if ( file.isFile() ) {
                //System.out.println("(파일1) " + file.getAbsolutePath());
                //System.out.println("file.getParentFile() : " + file.getParentFile().getAbsolutePath());
                System.out.println("(파일2) " + file.getParentFile().getAbsolutePath() + "\\" + file.getName());
                //System.out.println(file.getName());
            } else if ( file.isDirectory() ) {
                //System.out.println("(폴더1) " + file.getAbsolutePath());
                //System.out.println("file.getParentFile() : " + file.getParentFile());
                System.out.println("(폴더2) " + file.getParentFile().getAbsolutePath() + "\\" + file.getName());
                listAndFiles(file.listFiles());
            }

            //System.out.println(file.getName());

        }
    }
}
