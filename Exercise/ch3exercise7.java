// Exercise 3-7

public class ch3exercise7 {
    public static void main(String[] args) {
        int [] array = new int[10];
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10 + 1);
        }

        System.out.print("랜덤한 정수들 :");
        for(int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
            sum += array[i];
        }
        System.out.println();

        System.out.println("평균은 " + sum / 10.0);
    }
}
