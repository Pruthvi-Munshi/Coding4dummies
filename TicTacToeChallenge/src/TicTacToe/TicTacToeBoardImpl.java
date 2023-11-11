package TicTacToe;

public class TicTacToeBoardImpl implements TicTacToeBoard{
    // Symbolics:
    protected static final int NO_MOVE = -1;
    protected static final int NO_MATCH = -1;

    // so the user needs to give an array
    // code needs to recognize the array
    // code then sorts the array
    //      applies X or O to the corresponding tile
    //      first number will always == X second will always == O
    //      if there is even numbers that means next tile will be X
    //      if there is odd number the next tile will be O


    protected int[] movesArray;

    public TicTacToeBoardImpl() {
        final int CELL_COUNT = ROW_COUNT*COLUMN_COUNT;
        movesArray = new int[CELL_COUNT];
        for(int i = 0; i < CELL_COUNT; i++) {
            movesArray[i] = NO_MOVE;
        }
    }



    // hopefully this is correct lmao
    private static boolean RowColumnCheck(int row, int column){
        boolean isValidRowColumn = true;
        if (row < 0 || row > 2 || column < 0 || column > 2){
            isValidRowColumn = false;
            System.out.println("Row and Column needs be be >= 0 && <= 2");
            throw new AssertionError("Error: Row and Column needs be be >= 0 && <= 2");
        }
        return isValidRowColumn;
    }

    // gives the position based on row and column input
    private int RowColumnPosition( int row, int column){
        int rowColPos = NO_MOVE;

         if (RowColumnCheck(row, column)){
            if (row == 0 && column == 0){
                rowColPos = 0;
            }
            if (row == 0 && column == 1){
                rowColPos = 1;
            }
            if (row == 0 && column == 2){
                rowColPos = 2;
            }
            if (row == 1 && column == 0){
                rowColPos = 3;
            }
            if (row == 1 && column == 1){
                rowColPos = 4;
            }
            if (row == 1 && column == 2){
                rowColPos = 5;
            }
            if (row == 2 && column == 0){
                rowColPos = 6;
            }
            if (row == 2 && column == 1){
                rowColPos = 7;
            }
            if (row == 2 && column == 2){
                rowColPos = 8;
            }
        }

        return rowColPos;
    }

    public Mark getMark(int row, int column) {
        // get the mark (X, 0)
        // needs to get the position given by the row and column ints
        //      row and column can only be 0, 1, 2
        // need to check if the numbers entered for row and column are 0 or higher but less than 3
        //      RowColumnCheck does this
        // how to get it to determine what is at the position of row and column
        //      RowColumnPosition does this
        // need to return a X or O at the position of the column
        // need to first locate what is at the position
        // then we will take the element at the position and need to determine if it is an X or an O
        // how to determine if it is an X or an O
        //      the first number in the array will always be an X, second will be O, it will alternate after up to a max of 9
        // need to find what is at the element, then we need to find where that element is in the array
        // if element at position is 0 or even number in array then return X
        // if element at position is odd number in array then return 0
        // if there is -1 at position then return null

        // we have RowColumnCheck to see is (row, column) are within parameters
        //      - ex. if row = 3, column = 2, will return "need correct values"
        // we have RowColumnPosition to tell us what position corresponds to the (row, column) input
        //      - returns rowColPos
        //      - ex. (0,0) returns 0, (1,2) returns 5
        // now that we have the position we need to see where that number is in our array
        //      - sort?
        //      - make a counter to track of how many numbers you go through in the array
        //          - while loop?
        //          - need to read what is in the array, method arrayRead or something
        //          - in the loop have if statement rowColPos == arrayRead
        //          - get out of loop and get the counter
        //          - if the counter = 0 or even number then return mark X
        //          - if the counter = odd number then return mark 0
        //
        // im getting so confused
        // - so ill be give an array ie. [4,8,6,0,2,1,-1,-1,-1]
        // - getMark(0,2) means i need to find mark at rowColPos = 2
        // - 2 is the 4th num in the array, need a counter to track that
        // - 4th num = even num, therefore it will be an X
        // - in this example array the mark at position 2 = X

        Mark retPos = null;

        int position = RowColumnPosition(row, column);

        for (int posCheck = 0; posCheck < movesArray.length; posCheck++){
            if(movesArray[posCheck] == position){
                if(posCheck % 2 == 0){
                    retPos = Mark.X;
                }
                else{
                    retPos = Mark.O;
                }
            }
        }
        return retPos;
    }

    public void setMark(int row, int column) {
        // setting the placement number
        // add the item to the moves array in the correct placement
        // NOT IMPLEMENTED

        // need to set a mark at row column given
        // mark is either X or O
        // X is always first mark
        // find where the position is on the board
        // next I need to find where that is in the array
        // once I have it in the array I can assign a mark based on the position in the array

        // isnt this essentially the same as before?

        // think about scenarios and the conditions that need to be met
        // setMark is just finding the next position that is null and assigning it row, column

        // for loop for when you need to traverse an array
        // if statement for checking conditions

        // go through array if == nomoves assign row, column

        int markSet = RowColumnPosition(row, column);

        if(!isGameOver()){
            for(int posCheck = 0; posCheck < movesArray.length; posCheck++){
                if(movesArray[posCheck] == NO_MOVE){
                    movesArray[posCheck] = markSet;
                    break;
                }
                // checks if there is same mark trying to be set
                else if(movesArray[posCheck] == markSet){
                    System.out.println("Not possible");
                    throw new AssertionError("Error");
                }
            }
        }
        else{
            throw new AssertionError("Error");
        }

    }

    public Mark getTurn() {
        // looking for what is next X or O

        // go through the array and see what number it is on
        // if position % 2 = 0 then it is a O next turn, else it is an X
        // same logic?

        // need to get when the move is made not the position

        int posCount = 0;

        for (int posCheck = 0; posCheck < movesArray.length; posCheck++){
            if(movesArray[posCheck] != NO_MOVE){
                posCount++;
            }
            else{
                break;
            }
        }

        if (posCount % 2 == 0){
            return Mark.X;
        }
        else{
            return Mark.O;
        }
        // NOT IMPLEMENTED
    }

    public boolean isGameOver() {
        // check the number of moves made so far
        // if moves <= 7 return false
        // moves >= 8 return true

        // have a for loop
        // in the loop i need it to go through the array and see if there is actual number or -1

        // gotta first check if game is still running
        // checking for tie is just seeing if all moves have been made

        boolean gameOver = false;

        if(movesArray[8] != NO_MOVE){
            gameOver = true;
            // movesArray[8] != NO_MOVE means there is move at final position therefore game over
        }
        // getWinner() != null: getWinner() returns x or o
        else if(movesArray[4] != NO_MOVE){
            if(getWinner() != null){
                gameOver = true;
                // getWinner() != null: getWinner() returns x or o therefore game is over
            }
        }


        return gameOver;

    }

    public Mark getWinner(){
        // (0,0)|(0,1)|(0,2)                    0|1|2
        //------|-----|------                  --|-|--
        // (1,0)|(1,1)|(1,2)        ---->       3|4|5
        //------|-----|------                  --|-|--
        // (2,0)|(2,1)|(2,2)                    6|7|8

        // can hard code winner?
        // if getMark(0,0) == Mark.X && getMark(0,1) == Mark.X && getMark(0,2) == Mark.X
        //      - return "X is winner"

        Mark winner = null;


        // if i put all this in if(isGameOver()) what happens
        // first it goes through isGameOver()
        // in isGameOver() it will go through getWinner() and check each one to see if it returns x or o
        // if it returns x or o then game over and will continue to go through getWinner() and return the same answer essentially going through it twice
        // if it == true then it will go through getWinner() and return winner x,o, null

        // if iO/i1/i2/i3/i4 = 0 then return null cuz it is not possible to have a winner if either one of those is -1
        if (movesArray[0] == NO_MOVE || movesArray[4] == NO_MOVE){
            throw new AssertionError("Error: There is no winner");
        }

        else if (getMark(0,0) == Mark.X && getMark(0,1) == Mark.X && getMark(0,2) == Mark.X){
            winner = Mark.X;
            System.out.println("Winner is X");
        }
        else if (getMark(1,0) == Mark.X && getMark(1,1) == Mark.X && getMark(1,2) == Mark.X){
            winner = Mark.X;
            System.out.println("Winner is X");
        }
        else if (getMark(2,0) == Mark.X && getMark(2,1) == Mark.X && getMark(2,2) == Mark.X){
            winner = Mark.X;
            System.out.println("Winner is X");
        }
        else if (getMark(0,0) == Mark.X && getMark(1,0) == Mark.X && getMark(2,0) == Mark.X){
            winner = Mark.X;
            System.out.println("Winner is X");
        }
        else if (getMark(0,1) == Mark.X && getMark(1,1) == Mark.X && getMark(2,1) == Mark.X){
            winner = Mark.X;
            System.out.println("Winner is X");
        }
        else if (getMark(0,2) == Mark.X && getMark(1,2) == Mark.X && getMark(2,2) == Mark.X){
            winner = Mark.X;
            System.out.println("Winner is X");
        }
        else if (getMark(0,0) == Mark.X && getMark(1,1) == Mark.X && getMark(2,2) == Mark.X){
            winner = Mark.X;
            System.out.println("Winner is X");
        }
        else if (getMark(0,2) == Mark.X && getMark(1,1) == Mark.X && getMark(2,0) == Mark.X){
            winner = Mark.X;
            System.out.println("Winner is X");
        }


        else if (getMark(0,0) == Mark.O && getMark(0,1) == Mark.O && getMark(0,2) == Mark.O){
            winner = Mark.O;
            System.out.println("Winner is O");
        }
        else if (getMark(1,0) == Mark.O && getMark(1,1) == Mark.O && getMark(1,2) == Mark.O){
            winner = Mark.O;
            System.out.println("Winner is O");
        }
        else if (getMark(2,0) == Mark.O && getMark(2,1) == Mark.O && getMark(2,2) == Mark.O){
            winner = Mark.O;
            System.out.println("Winner is O");
        }
        else if (getMark(0,0) == Mark.O && getMark(1,0) == Mark.O && getMark(2,0) == Mark.O){
            winner = Mark.O;
            System.out.println("Winner is O");
        }
        else if (getMark(0,1) == Mark.O && getMark(1,1) == Mark.O && getMark(2,1) == Mark.O){
            winner = Mark.O;
            System.out.println("Winner is O");
        }
        else if (getMark(0,2) == Mark.O && getMark(1,2) == Mark.O && getMark(2,2) == Mark.O){
            winner = Mark.O;
            System.out.println("Winner is O");
        }
        else if (getMark(0,0) == Mark.O && getMark(1,1) == Mark.O && getMark(2,2) == Mark.O){
            winner = Mark.O;
            System.out.println("Winner is O");
        }
        else if (getMark(0,2) == Mark.O && getMark(1,1) == Mark.O && getMark(2,0) == Mark.O){
            winner = Mark.O;
            System.out.println("Winner is O");
        }
//        else{
//            throw new AssertionError("Error: There is no winner");
//        }

        return winner;

        // IDK WHAT TO RETURN

        // NOT IMPLEMENTED
    }

    @Override
    public String toString()
    {
        String TicTacToeBoard = "";
        if (getMark(0, 0) == null)
        {
            TicTacToeBoard += " |";
        }
        else
        {
            TicTacToeBoard += getMark(0, 0) + "|";
        }
        if (getMark(0, 1) == null)
        {
            TicTacToeBoard += " |";
        }
        else
        {
            TicTacToeBoard += getMark(0, 1) + "|";
        }
        if (getMark(0, 2) == null)
        {
            TicTacToeBoard += " \n";
        }
        else
        {
            TicTacToeBoard += getMark(0, 2) + "\n";
        }

        TicTacToeBoard += "_ _ _ \n";

        if (getMark(1, 0) == null)
        {
            TicTacToeBoard += " |";
        }
        else
        {
            TicTacToeBoard += getMark(1, 0) + "|";
        }
        if (getMark(1, 1) == null)
        {
            TicTacToeBoard += " |";
        }
        else
        {
            TicTacToeBoard += getMark(0, 0) + "|";
        }
        if (getMark(1, 2) == null)
        {
            TicTacToeBoard += " \n";
        }
        else
        {
            TicTacToeBoard += getMark(1, 2) + "\n";
        }

        TicTacToeBoard += "_ _ _ \n";

        if (getMark(2, 0) == null)
        {
            TicTacToeBoard += " |";
        }
        else
        {
            TicTacToeBoard += getMark(2, 0) + "|";
        }
        if (getMark(2, 1) == null)
        {
            TicTacToeBoard += " |";
        }
        else
        {
            TicTacToeBoard += getMark(2, 1) + "|";
        }
        if (getMark(2, 2) == null)
        {
            TicTacToeBoard += " \n";
        }
        else
        {
            TicTacToeBoard += getMark(2, 2) + "\n";
        }

        return TicTacToeBoard;

    }

}
