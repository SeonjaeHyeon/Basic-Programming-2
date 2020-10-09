// Exercise 3-10

import java.util.Random;

public class ch3exercise10 {
    public static void main(String[] args) {
        Random r = new Random();
        int [][] array = new int[4][4];
        int [] index = new int[10];
        
        int temp;
        boolean isDupe;
        for(int i = 0; i < index.length; i++) {
            while(true) {
                temp = r.nextInt(15);  // 0 ~ 15

                isDupe = false;
                for(int k: index) {
                    if(temp == k) {
                        isDupe = true;
                        break;
                    }
                }

                if(!isDupe) {
                    break;
                }
            }

            index[i] = temp;
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                for(int k = 0; k < index.length; k++) {
                    if(i * 4 + j == index[k]) {
                        array[i][j] = r.nextInt(9) + 1; // 1 ~ 10
                    }
                }
            }
        }

        for(int [] k: array) {
            for(int l: k) {
                System.out.print(l + "\t");
            }
            System.out.println();
        }
    }
}
