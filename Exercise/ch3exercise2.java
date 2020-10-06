// Exercise 3-2

public class ch3exercise2 {
    public static void main(String[] args) {
        int n [][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};

        System.out.println("이중 for문 이용");
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("이중 for-each문 이용");
        for (int[] i : n) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
