package leetcode;

public class Question289 {
    public void gameOfLife(int[][] board) {
        int r = board.length, c = board[0].length, count;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {

                count = aliveCount(board, i, j);
                if(count == 0) {
                    board[i][j] = board[i][j] == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                } else if(board[i][j] == 0) {
                    board[i][j] = -1 * count;
                } else {
                    board[i][j] = count;
                }
            }
        }

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                count = Math.abs(board[i][j]);
                if(count < 2 || count > 3) {
                    board[i][j] = 0;
                } else if(count == 3) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = board[i][j] < 0 ? 0 : 1;
                }
            }
        }
    }

    public int aliveCount(int[][] board, int i, int j) {
        int r = board.length, c = board[0].length, aliveCount = 0, x, y;
        int[] dir = new int[]{-1, 0, 1};

        for(int k = 0; k < 3; k++) {
            x = j + dir[k];
            for(int l = 0; l < 3; l++) {
                y = i + dir[l];

                if(x >= 0 && x < c && y >= 0 && y < r && (x != j || y != i) && board[y][x] > 0) {
                    aliveCount++;
                }
            }
        }

        return aliveCount;
    }
}
