package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("goodjob.txt");

        if( file.exists() ) {
            if (file.delete()) {
                System.out.println("파일 삭제 성공 : " + file.getAbsolutePath());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getAbsolutePath());
            }
        }
        else {
            System.out.println("파일이 없습니다.");
        }

        System.out.println("-------------------------------");

        File folder = new File("A");
        if( folder.exists() ) {
            if (folder.delete()) {
                System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
            }
        }
        else {
            System.out.println("파일이 없습니다.");
        }

        System.out.println("-----------------------------");
        if( folder.exists() ) {
            if (deleteFolder(folder)) {
                System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
            }
        }
        else {
            System.out.println("파일이 없습니다.");
        }


    }


    public static boolean deleteFolder(File folder) {
        if( folder.isDirectory() ) {
            for (File file : folder.listFiles()) {
                deleteFolder(file);
            }
        }
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();

    }
}
