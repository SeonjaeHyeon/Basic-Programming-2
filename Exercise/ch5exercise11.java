// Exercise 5-11

import java.util.Scanner;

abstract class Calc {
    protected int a;
    protected int b;

    public abstract void setValue(int a, int b);
    public abstract int calculate();
}

class Add extends Calc {
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return this.a + this.b;
    }
}

class Sub extends Calc {
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return this.a - this.b;
    }
}

class Mul extends Calc {
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return this.a * this.b;
    }
}

class Div extends Calc {
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return this.a / this.b;
    }
}

public class ch5exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operator = scanner.next();

        if(operator.equals("+")) {
            Add calc = new Add();
            calc.setValue(a, b);
            System.out.println(calc.calculate());
        }
        else if(operator.equals("-")) {
            Sub calc = new Sub();
            calc.setValue(a, b);
            System.out.println(calc.calculate());
        }
        else if(operator.equals("*")) {
            Mul calc = new Mul();
            calc.setValue(a, b);
            System.out.println(calc.calculate());
        }
        else if(operator.equals("/")) {
            Div calc = new Div();
            calc.setValue(a, b);
            System.out.println(calc.calculate());
        }

        scanner.close();
    }
}
