/**
 * ConnectFour Class
 * @author 26prakash
 * @version 05.16.2023
 */

public class ConnectFour implements BoardGame{
    private int[][] board;
    private int currentPlayer;
    private Position[] winningPositions;


    /**
     * newGame method of the ConnectFour class
     * Acts as a "constructor" and initializes the board, the currentPlayer, and the winningPositions array
     */
    @Override
    public void newGame() {
        board = new int[6][7];
        currentPlayer = 1+ (int)(Math.random()*2);
        winningPositions = new Position[4];
    }

    /**
     * gameOver method of the ConnectFour class
     * @return true or false, whether the game is over or not
     */
    @Override
    public boolean gameOver() {
        int x = 0;
        for(int i = 0; i < 7; i++) {
            if(columnFull(i)){
                x++;
            }
        }
        if(x==7) {
            winningPositions[0] = new Position(-1, -1);
            return true;
        }

        currentPlayer = (currentPlayer == 2) ? 1:2;

        for(int c = 0; c < board.length; c++) {
            for(int r = 0; r < 3; r++) {
                if(board[r][c] == currentPlayer &&
                        board[r+1][c] == currentPlayer &&
                        board[r+2][c] == currentPlayer &&
                        board[r+3][c] == currentPlayer
                ) {
                    winningPositions[0] = new Position(r,c);
                    winningPositions[1] = new Position(r+1,c);
                    winningPositions[2] = new Position(r+2, c);
                    winningPositions[3] = new Position(r+3, c);
                    return true;
                }
            }
        }

        for(int c = 0; c <=3; c++) {
            for(int r = 0; r < board[0].length-1; r++) {
                if(board[r][c] == currentPlayer &&
                        board[r][c+1] == currentPlayer &&
                        board[r][c+2] == currentPlayer &&
                        board[r][c+3] == currentPlayer
                ) {
                    winningPositions[0] = new Position(r,c);
                    winningPositions[1] = new Position(r,c+1);
                    winningPositions[2] = new Position(r, c+2);
                    winningPositions[3] = new Position(r, c+3);
                    return true;
                }
            }
        }

        for(int c = 0; c <=3; c++) {
            for(int r = 0; r < board[0].length-1; r++) {
                if(board[r][c] == currentPlayer &&
                        board[r][c+1] == currentPlayer &&
                        board[r][c+2] == currentPlayer &&
                        board[r][c+3] == currentPlayer
                ) {
                    winningPositions[0] = new Position(r,c);
                    winningPositions[1] = new Position(r,c+1);
                    winningPositions[2] = new Position(r, c+2);
                    winningPositions[3] = new Position(r, c+3);
                    return true;
                }
            }
        }

        for(int c = 0; c <=3; c++) {
            for(int r = 0; r < 3; r++) {
                if(board[r][c] == currentPlayer &&
                        board[r+1][c+1] == currentPlayer &&
                        board[r+2][c+2] == currentPlayer &&
                        board[r+3][c+3] == currentPlayer
                ) {
                    winningPositions[0] = new Position(r,c);
                    winningPositions[1] = new Position(r+1,c+1);
                    winningPositions[2] = new Position(r+2, c+2);
                    winningPositions[3] = new Position(r+3, c+3);
                    return true;
                }
            }
        }

        for(int c = 0; c <=3; c++) {
            for(int r = board[0].length-2; r >= 3; r--) {
                if(board[r][c] == currentPlayer &&
                        board[r-1][c+1] == currentPlayer &&
                        board[r-2][c+2] == currentPlayer &&
                        board[r-3][c+3] == currentPlayer
                ) {
                    winningPositions[0] = new Position(r,c);
                    winningPositions[1] = new Position(r-1,c+1);
                    winningPositions[2] = new Position(r-2, c+2);
                    winningPositions[3] = new Position(r-3, c+3);
                    return true;
                }
            }
        }

        currentPlayer = (currentPlayer == 2) ? 1:2;
        return false;
    }

    /**
     * getWinner method of the ConnectFour class
     * @return currentPlayer the winner of the game.
     */
    @Override
    public int getWinner() {
        return currentPlayer;
    }


    /**
     * getWinningPositions method of the ConnectFour class
     * @return winningPositions, the winning positions
     */
    @Override
    public Position[] getWinningPositions() {
        return winningPositions;
    }

    /**
     * columnFull method of the ConnectFour class
     * @param column the column number
     * @return true or false, whether the column is full or not
     */
    @Override
    public boolean columnFull(int column) {
        return board[0][column] != 0;
    }

    /**
     * play method of the ConnectFour class
     * @param column the column number
     * Places a piece in the given column
     */
    @Override
    public void play(int column) {
         if(!columnFull(column)) {
             for(int i = 5; i >= 0; i--) {
                 if(board[i][column] == 0) {
                     board[i][column] = currentPlayer;
                     currentPlayer = (currentPlayer == 2) ? 1:2;
                     return;
                 }
             }
         }

    }

    /**
     * getBoard method of the ConnectFour class
     * @return the board
     */
    @Override
    public int[][] getBoard() {
        return board;
    }
}
