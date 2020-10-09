// Exercise 3-11

public class ch3exercise11 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        System.out.println(sum / args.length);
    }
}
