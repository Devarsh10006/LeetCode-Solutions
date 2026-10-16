class Solution {
    public boolean exist(char[][] board, String word) {
        
        int m = board.length;
        int n = board[0].length;
        int sln = word.length();

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
                if (find(board, word, i, j, 0)) return true
            ;
        }

        return false;
    }

    private boolean find(char[][] board, String word, int i, int j, int k) {
        
        //  Boundry  check karva mate
        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length
        ) { return false; }

        if (board[i][j] != word.charAt(k)) return false;

        if (k == word.length() - 1) return true;

        // Current cell ne visit mark
        char ch = board[i][j];
        board[i][j] = '#';

        // 4 directions ma check karo
        boolean found =
            find(board, word, i + 1, j, k + 1) ||
            find(board, word, i - 1, j, k + 1) ||
            find(board, word, i, j + 1, k + 1) ||
            find(board, word, i, j - 1, k + 1)
        ;

        board[i][j] = ch;

        return found;
    }
}