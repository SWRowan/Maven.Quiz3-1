package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        Integer x = 0;
        String[] arr = new String[3];
         for(String[] str : board){
             arr[x] = str[value];
             x++;
         }
        return arr;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String x = getRow(rowIndex)[0];
         for (String str : getRow(rowIndex)){
             if(!str.equals(x)){
                 return false;
             }
         }

        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String x = getColumn(columnIndex)[0];
        for (String str : getColumn(columnIndex)){
            if(!str.equals(x)){
                return false;
            }
        }
        return true;
    }

    public String getWinner() {
        for (int i = 0; i < 2; i++) {
            if (isRowHomogenous(i)) {
                return getRow(i)[0];
            } else if (isColumnHomogeneous(i)) {
                return getColumn(i)[0];
            }else if(board[i][i].equals(board[i+1][i+1])){
                return board[i][i];
            }
        }
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
