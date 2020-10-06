// Exercise 3-1

class WhileTest {
    int sum = 0, i = 0;

    public WhileTest() {}

    public int task() {
        while (i < 100) {
            sum = sum + i;
            i += 2;
        }
        return sum;
    }
}

class ForTest {
    int sum = 0, i = 0;

    public ForTest() {}

    public int task() {
        for (; i < 100; i += 2) {
            sum = sum + i;
        }
        
        return sum;
    }
}

class DoWhileTest {
    int sum = 0, i = 0;

    public DoWhileTest() {}

    public int task() {
        do {
            sum = sum + i;
            i += 2;
        } while (i < 100);
        
        return sum;
    }
}

public class ch3exercise1 {
    public static void main(String[] args) {
        WhileTest while_test = new WhileTest();
        ForTest for_test = new ForTest();
        DoWhileTest do_while_test = new DoWhileTest();

        System.out.println("While문 이용");
        System.out.println(while_test.task());
        System.out.println();

        System.out.println("For문 이용");
        System.out.println(for_test.task());
        System.out.println();

        System.out.println("Do-While문 이용");
        System.out.println(do_while_test.task());
    }
}


