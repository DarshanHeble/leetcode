class Solution {
    public int numRookCaptures(char[][] board) {
        int attacked = 0;
        int posx = -1;
        int posy = -1;

        // Get the Rookie position
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[0].length; j ++) {
                if (board[i][j] == 'R') {
                    posx = i;
                    posy = j;
                }
            }
        }

        // Define the directions LEFT UP RIGHT DOWN
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        // Check through all the directions 
        for (int[] dir : directions) {
            int x = posx;
            int y = posy;

            while (true) {
                x += dir[0];
                y += dir[1];

                if (x < 0 || x >= 8 || y < 0 || y >= 8) break;
                
                if (board[x][y] == 'B') break;

                if (board[x][y] == 'p') {
                    attacked++;
                    break;
                } 
            }
        }

        return attacked;
    }
}