package algorithms.dynamicprogramming;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        System.out.println(solve("abcskldj", "ldj"));
        System.out.println(spaceOptimized("abcskldj", "ldj"));
    }

    public static int solve(String first, String second) {
        int n = first.length(), m = second.length(), res = 0;
        int[][] dp = new int[n + 1][m + 1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(first.charAt(i - 1) == second.charAt((j - 1))) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }

        return res;
    }

    public static String spaceOptimized(String a, String b) {
        int n = a.length(), m = b.length();
        int[] dp = new int[m+1];

        int end = n, maxLen = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++)
            for(int j = m; j > 0; j--) {
                dp[j] = a.charAt(i-1) == b.charAt(j-1) ? dp[j-1] + 1 : 0;
                if(dp[j] > maxLen) {
                    maxLen = dp[j];
                    end = i;
                }
            }

        return maxLen == Integer.MIN_VALUE ? null : a.substring(end - maxLen, end);
    }
}
