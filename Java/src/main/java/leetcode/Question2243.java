package leetcode;

public class Question2243 {
    public String digitSum(String s, int k) {
        String str = s;
        while(str.length() > k) {
            str = solve(str, k);
        }

        return str;
    }

    public String solve(String s, int k) {
        StringBuilder res = new StringBuilder();

        int index = k;
        while(index - k < s.length()) {
            String str = s.substring(index - k, Math.min(index, s.length()));

            int total = 0;
            for(int i = 0; i < str.length(); i++) {
                total += (str.charAt(i) - '0');
            }

            res.append(String.valueOf(total));
            index += k;
        }

        return res.toString();
    }
}
