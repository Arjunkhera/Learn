package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(input));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> store = new HashMap<>();
        int ans = 0, left = -1, index;

        for(int right = 0; right < s.length(); right++) {
            Character ch = s.charAt(right);
            index = store.getOrDefault(ch, left);
            if(index > left) {
                left = index;
            }
            store.put(ch, right);

            ans = Math.max(ans, right - left);
        }

        return ans;
    }
}
