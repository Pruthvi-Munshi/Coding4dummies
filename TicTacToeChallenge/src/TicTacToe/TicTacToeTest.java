package TicTacToe;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TicTacToeTest {

    private TicTacToeBoardImpl board;

    @Before
    public void setUp() {
        board = new TicTacToeBoardImpl();
    }

    @Test
    public void testTicTacToeGame() {

        int[] moves = {0, 4, 8, 6, 2, 5, 1, -1, -1};

        // making sure game starts at X
        assertEquals(Mark.X, board.getTurn());
        // getting null before making move
        assertNull(board.getMark(0, 0));
        // makes a move
        board.setMark(0, 0);
        assertEquals(Mark.X, board.getMark(0, 0));

        assertEquals(Mark.O, board.getTurn());
        assertNull(board.getMark(1, 1));
        board.setMark(1, 1);
        assertEquals(Mark.O, board.getMark(1, 1));

        assertEquals(Mark.X, board.getTurn());
        assertNull(board.getMark(2, 2));
        board.setMark(2, 2);
        assertEquals(Mark.X, board.getMark(2, 2));

        assertEquals(Mark.O, board.getTurn());
        assertNull(board.getMark(2, 0));
        board.setMark(2, 0);
        assertEquals(Mark.O, board.getMark(2, 0));

        assertEquals(Mark.X, board.getTurn());
        assertNull(board.getMark(0, 2));
        board.setMark(0, 2);
        assertEquals(Mark.X, board.getMark(0, 2));

        assertEquals(Mark.O, board.getTurn());
        assertNull(board.getMark(1, 2));
        board.setMark(1, 2);
        assertEquals(Mark.O, board.getMark(1, 2));

        assertEquals(Mark.X, board.getTurn());
        assertNull(board.getMark(0, 1));
        board.setMark(0, 1);
        assertEquals(Mark.X, board.getMark(0, 1));

        assertEquals(Arrays.toString(board.movesArray), Arrays.toString(moves));
        assertEquals(Mark.X, board.getWinner());
    }

    @Test
    public void testSetMarkAfterGameOver(){

        //SETUP
        int[] moves = {4, 0 ,8, 2, 3, 1, -1, -1, -1};

        board.setMark(1, 1);
        board.setMark(0, 0);
        board.setMark(2, 2);
        board.setMark(0, 2);
        board.setMark(1, 0);
        board.setMark(0, 1);

        //TEST
        assertThrows(AssertionError.class, () -> {
            board.setMark(1, 2);
                });

        assertEquals(Arrays.toString(board.movesArray), Arrays.toString(moves));
    }

    @Test
    public void testSetMarkAfterGameOver2(){

        //SETUP
        int[] moves = {0, 3, 1, 4, 2, -1, -1, -1, -1};

        board.setMark(0, 0);
        board.setMark(1, 0);
        board.setMark(0, 1);
        board.setMark(1, 1);
        board.setMark(0, 2);

        //TEST
        assertThrows(AssertionError.class, () -> {
            board.setMark(1, 2);
        });

        assertEquals(Arrays.toString(board.movesArray), Arrays.toString(moves));
    }

    @Test
    public void testSetMarkOutOfBounds(){

        // TEST COL TOO BIG
        assertThrows(AssertionError.class, () -> {
            board.setMark(0, 4);
        });

        // TEST ROW TOO BIG
        assertThrows(AssertionError.class, () -> {
            board.setMark(6, 2);
        });

        // TEST COL TOO SMALL
        assertThrows(AssertionError.class, () -> {
            board.setMark(0, -4);
        });

        // TEST ROW TOO SMALL
        assertThrows(AssertionError.class, () -> {
            board.setMark(-6, 2);
        });
    }

    @Test
    public void testGetMarkOutOfBounds(){

        //TEST ROW TOO SMALL
        assertThrows(AssertionError.class, () -> {
            board.getMark(-1, 2);
        });

        //TEST COL TOO SMALL
        assertThrows(AssertionError.class, () -> {
            board.getMark(0, -2);
        });

        //TEST ROW TOO BIG
        assertThrows(AssertionError.class, () -> {
            board.getMark(5, 0);
        });

        //TEST COL TOO BIG
        assertThrows(AssertionError.class, () -> {
            board.getMark(0, 5);
        });
    }

    @Test
    public void testTie(){

        //SETUP
        //moves: {0, 4, 3, 6, 2, 1, 7, 5, 8}
        board.setMark(0, 0);
        board.setMark(1, 1);
        board.setMark(1, 0);
        board.setMark(2, 0);
        board.setMark(0, 2);
        board.setMark(0, 1);
        board.setMark(2, 1);
        board.setMark(1, 2);
        board.setMark(2, 2);

        //TEST
        assertTrue(board.isGameOver());
        assertNull(board.getWinner());
    }

    @Test
    public void testEmptyBoardGetWinner(){
        assertThrows(AssertionError.class, () -> {
            board.getWinner();
        });
    }

    @Test
    public void testTwoRoundsGetWinner(){
        //SETUP
        board.setMark(0, 0);
        board.setMark(1, 0);

        //TEST
        assertThrows(AssertionError.class, () -> {
            board.getWinner();
        });
    }

    @Test
    public void testThreeRoundsGetWinner(){
        //SETUP
        board.setMark(0, 0);
        board.setMark(1, 0);
        board.setMark(1, 1);

        //TEST
        assertThrows(AssertionError.class, () -> {
            board.getWinner();
        });
    }

    @Test
    public void testSetMarkTwice(){
        //SETUP
        board.setMark(0, 0);

        //TEST
        assertThrows(AssertionError.class, () -> {
           board.setMark(0, 0);
        });
    }

    @Test
    public void testTieGameSetMark(){
        //SETUP
        //moves: {0, 4, 3, 6, 2, 1, 7, 5, 8}
        board.setMark(0, 0);
        board.setMark(1, 1);
        board.setMark(1, 0);
        board.setMark(2, 0);
        board.setMark(0, 2);
        board.setMark(0, 1);
        board.setMark(2, 1);
        board.setMark(1, 2);
        board.setMark(2, 2);

        assertThrows(AssertionError.class, () -> {
            board.setMark(0, 0);
        });


    }

}