// 60201716 현선재

import java.util.Scanner;

class Add {
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a + b;
	}
}

class Sub {
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a - b;
	}
}

class Mul {
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a * b;
	}
}

class Div {
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a / b;
	}
}

class Rem {
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a % b;
	}
}

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa;
		int bb;
		String operator;
		int result;
		
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		Scanner scanner = new Scanner(System.in);
		
		aa = scanner.nextInt();
		bb = scanner.nextInt();
		operator = scanner.next();
		
		if(operator.equals("+")) {
			Add calc = new Add();
			calc.setValue(aa, bb);
			result = calc.calculate();
			System.out.println(result);
		}
		else if(operator.equals("-")) {
			Sub calc = new Sub();
			calc.setValue(aa, bb);
			result = calc.calculate();
			System.out.println(result);
		}
		else if(operator.equals("*")) {
			Mul calc = new Mul();
			calc.setValue(aa, bb);
			result = calc.calculate();
			System.out.println(result);
		}
		else if(operator.equals("/")) {
			Div calc = new Div();
			calc.setValue(aa, bb);
			result = calc.calculate();
			System.out.println(result);
		}
		else if(operator.equals("%")) {
			Rem calc = new Rem();
			calc.setValue(aa, bb);
			result = calc.calculate();
			System.out.println(result);
		}
		
		scanner.close();
	}

}
