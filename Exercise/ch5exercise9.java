// Exercise 5-9

import java.util.Scanner;

interface Stack {
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack {
	private String [] stack;
	private int len;
	
	
	public StringStack(int c) {
		this.stack = new String[c];
	}
	
	public int length() {
		return this.len;
	}
	
	public int capacity() {
		return this.stack.length;
	}
	
	public String pop() {
		String result = "";
		
		for(String k: this.stack) {
			result += " " + k;
		}
		
		return result;
	}
	
	public boolean push(String val) {
		if(this.len == this.stack.length) {
			return false;
		}
		
		this.stack[this.stack.length - this.len - 1] = val;
		this.len++;
		
		return true;
	}
}

public class ch5exercise9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int len = scanner.nextInt();
		
		StringStack ss = new StringStack(len);
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			String input = scanner.next();
			
			if(input.equals("그만")) {
				System.out.println("스택에 있는 모든 문자열 팝 :" + ss.pop());
				break;
			}
			
			if(!ss.push(input)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		
		scanner.close();
	}
}
