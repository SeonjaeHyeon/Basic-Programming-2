public class str_bubblesort {
    public static String[] sort(String[] s, boolean isDescend) {
        if(s.length == 0) {
            return s;
        }

        for(int i = 0; i < s.length - 1; i++) {
			for(int j = 0; j < s.length - 1 - i; j++) {
				if(s[j].compareTo(s[j + 1]) > 0) {
					String temp1 = s[j + 1];
					String temp2 = s[j];
					
					s[j] = temp1;
					s[j + 1] = temp2;
				}
			}
        }

        if(isDescend) {
            String [] t = new String[s.length];
            for(int i = 0; i < s.length; i++) {
                t[i] = s[s.length - 1 - i];
            }

            return t;
        }
        
        return s;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";

        System.out.println("오름차순 정렬");
        for(String k : sort(str.split(" "), false)) {
            System.out.print(k + "\t");
        }
        System.out.println("\n");

        System.out.println("내림차순 정렬");
        for(String k : sort(str.split(" "), true)) {
            System.out.print(k + "\t");
        }
    }
}