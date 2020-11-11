// Exercise 8-13

import java.io.*;
import java.util.*;

public class ch8exercise13 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("***** 파일 탐색기입니다. *****");

            File f = new File("C:\\");
            File[] fList = f.listFiles();
            System.out.println("\t[" + f.getPath() + "]");
            for(File e: fList) {
                if(e.isDirectory()) {
                    System.out.print("dir");
                }
                else {
                    System.out.print("file");
                }

                System.out.println("\t" + e.length() + "바이트\t" + e.getName());
            }
            
            while(true) {
                System.out.print(">>");
                String path = sc.nextLine();
                if(path.equals("..")) {
                    if(!f.getPath().equals("C:\\")) {
                        f = new File(f.getParent());
                    }
                }
                else if(path.equals("그만")) {
                    sc.close();
                    break;
                }
                else {
                    f = new File(f.getPath() + "\\" + path);
                }
                fList = f.listFiles();
                System.out.println("\t[" + f.getPath() + "]");
                for(File e: fList) {
                    if(e.isDirectory()) {
                        System.out.print("dir");
                    }
                    else {
                        System.out.print("file");
                    }
    
                    System.out.println("\t" + e.length() + "바이트\t" + e.getName());
                }
            }
            
        } catch(Exception e) {
            System.out.println("오류 발생");
        }

    }
}
