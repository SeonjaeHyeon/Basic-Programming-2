// Exercise 3-9

public class ch3exercise9 {
    public static void main(String[] args) {
        int [][] array = new int[4][4];

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                array[i][j] = (int) (Math.random()*10 + 1);
            }
        }

        for(int[] k: array) {
            for(int l: k) {
                System.out.print(l + "\t");
            }
            System.out.println();
        }
    }
}
