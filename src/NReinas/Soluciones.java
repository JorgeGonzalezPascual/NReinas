package NReinas;

public class Soluciones {

    private int[][] board;

    Soluciones(int max) {
        board = new int[max][max];
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                board[i][j] = 0;
            }
        }
    }

    public void fill(int[][] b, int max) {
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                board[i][j] = b[i][j];
            }
        }
    }

    public void clear(int max) {
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                board[i][j] = 0;
            }
        }
    }

    public void print(int max) {
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public int[][] getBoard() {
        return board;
    }

}
