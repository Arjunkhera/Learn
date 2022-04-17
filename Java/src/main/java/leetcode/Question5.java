package leetcode;

public class Question5 {
    int left, right, ans = Integer.MIN_VALUE;;

    public String longestPalindrome(String s) {
        for(int i = 0; i < s.length(); i++) {
            expand(s, i, i);
            expand(s, i, i+1);
        }

        return s.substring(left, right);
    }

    public void expand(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--; r++;
        }

        if(r-l-1 > ans) {
            ans = r-l-1;
            left = l+1;
            right = r;
        }
    }
}
