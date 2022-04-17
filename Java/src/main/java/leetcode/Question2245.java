package leetcode;

public class Question2245 {
    public int maxTrailingZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length, res = 0;

        int[][][] hor = new int[m][n][2];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int[] facs = factors(grid[i][j]);
                if(j == 0) {
                    hor[i][j] = facs;
                } else {
                    hor[i][j][0] = hor[i][j - 1][0] + facs[0];
                    hor[i][j][1] = hor[i][j - 1][1] + facs[1];
                }
            }
        }

        int[][][] ver = new int[m][n][2];
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < m; i++) {
                int[] facs = factors(grid[i][j]);
                if(i == 0) {
                    ver[i][j] = facs;
                } else {
                    ver[i][j][0] = ver[i - 1][j][0] + facs[0];
                    ver[i][j][1] = ver[i - 1][j][1] + facs[1];
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int[] cur = factors(grid[i][j]);
                int[] y = ver[m - 1][j];
                int[] c = ver[i][j];
                int[] x = hor[i][n - 1];
                int[] r = hor[i][j];

                // up and left
                res = Math.max(res, Math.min(c[0] + r[0] - cur[0], c[1] + r[1] - cur[1]));
                // up and right
                res = Math.max(res, Math.min(x[0] - r[0] + c[0], x[1] - r[1] + c[1]));
                // down and left
                res = Math.max(res, Math.min(y[0] - c[0] + r[0], y[1] - c[1] + r[1]));
                // down and right
                res = Math.max(res, Math.min(x[0] - r[0] + y[0] - c[0] + cur[0], x[1] - r[1] + y[1] - c[1] + cur[1]));
            }
        }

        return res;
    }

    public int[] factors(int value) {
        int[] res = new int[]{0, 0};

        while(value > 0 && value % 2 == 0) {
            res[0]++;
            value /= 2;
        }
        while(value > 0 && value % 5 == 0) {
            res[1]++;
            value /= 5;
        }

        return res;
    }
}
