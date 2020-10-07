// Exercise 3-8

import java.util.Random;
import java.util.Scanner;

public class ch3exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("정수 몇개?");
        int index = scanner.nextInt();
        int [] array = new int[index];

        int temp;
        boolean isDupe;
        for(int i = 0; i < index; i++) {
            while(true) {
                temp = r.nextInt(99) + 1;  // 1 ~ 100

                isDupe = false;
                for(int k: array) {
                    if(temp == k) {
                        isDupe = true;
                        break;
                    }
                }

                if(!isDupe) {
                    break;
                }
            }

            array[i] = temp;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if((i + 1) % 10 == 0) {
                System.out.println();
                continue;
            }
            System.out.print(" ");
        }

        scanner.close();
    }
}
