// Open Challenge 8

import java.io.*;
import java.util.*;

public class ch8challenge {
    public static Vector<Integer> randNum(int length) {
        Random rand = new Random();
        var num = new Vector<Integer>();
        num.add(-1);
        num.add(-1);

        for(int i = 0; i < 2; i++) {
            num.set(i, rand.nextInt(length));

            if(num.get(0) == num.get(1)) {
                i--;
                break;
            }
        }

        return num;
    }

    public static void printWord(char[] array, Vector<Integer> num) {
        for(int i = 0; i < array.length; i++) {
            boolean isHide = false;
            for(int j = 0; j < num.size(); j++) {
                if(i == num.get(j)) {
                    System.out.print("-");
                    isHide = true;
                    break;
                }
            }

            if(!isHide) {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        var wordVector = new Vector<String>();

        try {
            Scanner fScanner = new Scanner(new FileReader("words.txt"));
            while(fScanner.hasNext()) {
                String word = fScanner.nextLine();
                wordVector.add(word);
            }

            fScanner.close();
        } catch(IOException e) {
            System.out.println("파일 입출력 오류");
        } catch(Exception e) {
            System.out.println("알 수 없는 오류");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("지금부터 행맨 게임을 시작합니다.");
        while(true) {
            int index = rand.nextInt(wordVector.size());
            String word = wordVector.get(index);
            char[] array = word.toCharArray();

            var num = randNum(word.length());
            printWord(array, num);

            int chance = 5;
            while(num.size() != 0) {
                System.out.print(">>");
                String ans = scan.nextLine();
                for(int i = 0; i < num.size(); i++) {
                    if(ans.charAt(0) == array[num.get(i)]) {
                        num.remove(i);
                        chance++;
                    }
                }
                chance--;
                if(chance == 0) {
                    break;
                }

                printWord(array, num);
            }

            if(chance == 0) {
                System.out.println("5번 실패 하였습니다.");
                System.out.println(word);
            }

            System.out.print("Next(y/n)?>>");
            String ans = scan.nextLine();
            if(ans.equals("n")) {
                break;
            }
        }

        scan.close();
    }
}
