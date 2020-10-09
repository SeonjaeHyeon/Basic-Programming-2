// Exercise 3-13

public class ch3exercise13 {
    public static void main(String[] args) {
        int ten;
        int one;
        
        for(int i = 0; i < 100; i++) {
            ten = i / 10;
            one = i % 10;
            
            if(ten == 3 || ten == 6 || ten == 9) {
                System.out.print(i + " 박수 짝");
                if(one == 3 || one == 6 || one == 9) {
                    System.out.print("짝");
                }
                System.out.println();
            }
            else if(one == 3 || one == 6 || one == 9) {
                System.out.println(i + " 박수 짝");
            }
        }
    }
}
