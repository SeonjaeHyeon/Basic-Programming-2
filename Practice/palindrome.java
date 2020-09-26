import java.util.Scanner;

public class palindrome {
	public static boolean isPalindrome(String s) {
		String[] compare = s.split("");
		String next = "";
		
		if(s.length() <= 1) {
			return true;
		}
		else {
			for(int i = 1; i < s.length() - 1; i++) {
				next += compare[i];
			}
			
			return compare[0].equals(compare[compare.length - 1]) && isPalindrome(next);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 입력>> ");
		
		String str = scanner.next();
		
		if(isPalindrome(str)) {
			System.out.println("회문입니다.");
		}
		else {
			System.out.println("회문이 아닙니다.");
		}
		
		scanner.close();
	}
}
