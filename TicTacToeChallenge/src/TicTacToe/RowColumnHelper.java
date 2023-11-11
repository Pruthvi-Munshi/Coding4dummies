package TicTacToe;

// make a helper method to test if row and column have correct values (0>= && < 3)
// same helper can check where the placement is on board for (row, column)
//
// (0,0)|(0,1)|(0,2)                    0|1|2
//------|-----|------                  --|-|--
// (1,0)|(1,1)|(1,2)        ---->       3|4|5
//------|-----|------                  --|-|--
// (2,0)|(2,1)|(2,2)                    6|7|8
//
// if (row,column) count is correct then it goes to check where the (row, column) is on board,
// so it will look something like if (1,2) --> return 5


public class RowColumnHelper {
    public int row;
    public int column;

    public int rowColPos;

    // hopefully this is correct lmao
    public static int RowColumnCheck(int row, int column){
        if (row < 0 || row > 2 || column < 0 || column > 2){
            System.out.println("Row and Column needs be be >= 0 && <= 2");
        }
        return row | column;
    }

    // gives the position based on row and column input
    public int RowColumnPosition( int row, int column){
        if (row == 0 || column == 0){
            rowColPos = 0;
        }
        if (row == 0 || column == 1){
            rowColPos = 1;
        }
        if (row == 0 || column == 2){
            rowColPos = 2;
        }
        if (row == 1 || column == 0){
            rowColPos = 3;
        }
        if (row == 1 || column == 1){
            rowColPos = 4;
        }
        if (row == 1 || column == 2){
            rowColPos = 5;
        }
        if (row == 2 || column == 0){
            rowColPos = 6;
        }
        if (row == 2 || column == 1){
            rowColPos = 7;
        }
        if (row == 2 || column == 2){
            rowColPos = 8;
        }
        return rowColPos;
    }
}
