// Exercise 8-5

import java.io.*;
import java.util.Scanner;

public class ch8exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String firstPath = sc.nextLine();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String secondPath = sc.nextLine();

        sc.close();

        boolean isDiff = false;
        FileInputStream ffin = null;
        FileInputStream sfin = null;
        try {
            File ffp = new File(firstPath);
            File sfp = new File(secondPath);

            System.out.println(ffp.getName() + "와 " + sfp.getName() + "를 비교합니다.");

            ffin = new FileInputStream(ffp);
            sfin = new FileInputStream(sfp);

            byte[] fbyte = new byte[1024];
            byte[] sbyte = new byte[1024];
            int fPos = 0;
            int sPos = 0;

            while(true) {
                fPos = ffin.read(fbyte);
                sPos = sfin.read(sbyte);

                if(fPos != sPos) {
                    isDiff = true;
                    break;
                }

                if(fPos == -1) {
                    break;
                }

                for(int i = 0; i < fbyte.length; i++) {
                    if(fbyte[i] != sbyte[i]) {
                        isDiff = true;
                        break;
                    }
                }
                if(isDiff) {
                    break;
                }
            }

            ffin.close();
            sfin.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }

        if(isDiff) {
            System.out.println("파일이 다릅니다.");
        }
        else {
            System.out.println("파일이 같습니다.");
        }
    }
}
