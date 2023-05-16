/**
 * Positon class
 * @author 26prakash
 * @version 05.16.2023
 */

public class Position {
    private int row, col;

    /**
     * Position constructor
     * @param row the row that the position is initialized to
     * @param col the column that the position is initialized to
     */
    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * getRow method of the Position class
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * setRow method of the Position class
     * @param row the row that you are setting the position to
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * getCol method of the Position class
     * @return the column
     */
    public int getCol() {
        return col;
    }

    /**
     * setCol method of the Position class
     * @param col the column that you are setting the position to
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * equals method of the Positon class
     * @param o the object you are comparing to
     * @return the comparison between the two objects
     */
    public boolean equals(Object o) {
        if(o instanceof Position) {
            Position other = (Position)o;
            return this.row == other.row && this.col == other.col;
        }
        return false;
    }
}
