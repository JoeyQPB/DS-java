package othersAlgorithms;

public class ChessQueens {

    private int[][] tab;
    private int queens;

    public ChessQueens() {}

    public Boolean solution(int[][] board, int n) {
        if (n == 0) return true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (isThereAttack(i, j, board)) continue;
                board[i][j] = 1;

                if (solution(board, n -1 )) {
                    this.tab = board;
                    this.queens = n;
                    return true;
                }

                board[i][j] = 0;
            }
        }

        this.tab = board;
        this.queens = n;
        return false;
    }

    private boolean isThereAttack(int x, int y, int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[x][i] == 1 || board[i][y] == 1) return true;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int dLeft = i + j;
                int dRight = i - j;

                if (dLeft == (x + y)) {
                    if (board[i][j] == 1) return true;
                }

                if (dRight == (x - y)) {
                    if (board[i][j] == 1) return true;
                }
            }
        }

        return false;
    }

    public void getSuccessAnswer() {
        System.out.println("Solution to " + this.queens + " is: " + printBoard());
    }

    public void getFailedAnswer() {
        System.out.println("There is NO solution to " + this.queens + ". Board: " + printBoard());
    }

    private String printBoard() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab.length; j++) {
                sb.append(tab[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
