public class word_beauty {
    public static void main(String[] args) {
        String s = "bbbbbbbbaabc";

        long answer = 0;
        int temp = 0;

        int res;
        int res2;
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < s.length() - temp; j++) {
                String ss = s.substring(i, j + 1 + temp);

                res = 0;
                for(int k = ss.length() - 1; k > 0; k--) {
                    if(ss.charAt(0) != ss.charAt(k)) {
                        res = k;
                        break;
                    }
                }

                res2 = 0;
                for(int l = 0; l < ss.length() - 1; l++) {
                    if(ss.charAt(ss.length() - 1) != ss.charAt(l)) {
                        res2 = ss.length() - l - 1;
                        break;
                    }
                }

                if (res > res2) {
                    answer += res;
                }
                else {
                    answer += res2;
                }
            }
            temp += 1;
        }

        System.out.println("아름다움 결과: " + answer);
    }
}