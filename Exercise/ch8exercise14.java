// Exercise 8-14

import java.io.*;
import java.util.*;

public class ch8exercise14 {
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
                    StringTokenizer st = new StringTokenizer(path);
                    String cmd = "";
                    try {
                        cmd = st.nextToken();
                    } catch(NoSuchElementException e) {
                        System.out.println("알 수 없는 명령어입니다.");
                        continue;
                    }

                    if(cmd.equals("rename")) {
                        try {
                            String src = st.nextToken();
                            String dst = st.nextToken();

                            File r = new File(f.getPath() + "\\" + src);
                            if(r.renameTo(new File(f.getPath() + "\\" + dst))) {
                                System.out.println(src + "을/를 " + dst + " 이름 변경하였습니다.");
                            }
                            else {
                                System.out.println("이름 변경 실패하였습니다.");
                            }
                        } catch(NoSuchElementException e) {
                            System.out.println("두 개의 파일명이 주어지지 않았습니다.");
                            continue;
                        }
                    }
                    else if(cmd.equals("mkdir")) {
                        try {
                            String dir = st.nextToken();

                            File d = new File(f.getPath() + "\\" + dir);
                            if(d.mkdir()) {
                                System.out.println(dir + "디렉터리를 생성하였습니다.");
                            }
                            else {
                                System.out.println("디렉터리 생성 실패하였습니다.");
                            }
                        } catch(NoSuchElementException e) {
                            System.out.println("폴더명이 주어지지 않았습니다.");
                            continue;
                        }
                    }
                    else {
                        f = new File(f.getPath() + "\\" + path);
                    }
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
