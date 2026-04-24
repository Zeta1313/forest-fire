import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FireTest {
    @Test
    public void testTimeToBurnExample() {
        char[][] forest = {
            {'t','.','.','t','t','t','t','.','t'},
            {'.','.','t','t','.','.','.','.','t'},
            {'.','.','t','t','t','t','t','t','t'},
            {'t','t','t','t','.','.','.','.','.'}
        };

        int matchR = 2;
        int matchC = 6;

        int expected = 8;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    // Add more tests!

    @Test
    public void testTimeToBurnExample_Small() {
        char[][] forest = {
            {'t','.','.','t'},
            {'.','.','t','t'},
            {'.','.','t','t'},
            {'t','t','t','t'}
        };

        int matchR = 2;
        int matchC = 2;

        int expected = 3;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    @Test
    public void testTimeToBurnExample_Massive() {
        char[][] forest = {
            {'.','.','.','t','t','t','t','t','t','t','t','t','t','t','t','t'},
            {'.','.','t','t','t','t','t','t','.','.','.','.','.','t','t','.'},
            {'.','.','t','t','t','t','t','.','.','t','t','t','t','t','t','.'},
            {'.','t','t','t','t','t','.','t','t','t','t','t','t','t','t','t'},
            {'t','t','t','t','t','t','.','t','t','t','t','t','.','t','t','t'},
            {'t','t','t','t','t','t','.','t','t','t','t','.','.','t','t','t'},
            {'.','.','t','t','t','t','.','t','t','t','t','.','.','.','t','t'},
            {'.','t','t','t','t','t','.','t','t','t','t','t','t','t','t','t'},
            {'t','t','t','t','t','t','.','t','t','t','t','t','t','t','t','t'},
            {'.','.','.','t','t','t','t','t','t','t','t','t','t','t','t','t'},
            {'.','.','t','t','t','t','t','t','.','.','.','.','.','.','.','.'},
            {'.','.','t','t','t','t','t','.','.','t','t','t','t','t','t','.'},
            {'.','t','t','t','t','t','.','t','t','t','t','t','t','t','t','t'}
        };

        int matchR = 4;
        int matchC = 4;

        int expected = 20;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
    @Test
    public void testTimeToBurnExample_Null() {
        char[][] forest = null;

        int matchR = 0;
        int matchC = 0;

        int expected = 0;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
    @Test
    public void testTimeToBurnExample_OutOfBounds() {
        char[][] forest = {
            {'t','.','.','t','t','t','t','.','t'},
            {'.','.','t','t','.','.','.','.','t'},
            {'.','.','t','t','t','t','t','t','t'},
            {'t','t','t','t','.','.','.','.','.'}
        };

        int matchR = 10;
        int matchC = 10;

        int expected = 0;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
    @Test
    public void testTimeToBurnExample_oneTree() {
        char[][] forest = {
            {'t','.','.','.'},
            {'.','.','.','.'},
            {'.','.','.','.'},
            {'.','.','.','.'}
        };

        int matchR = 0;
        int matchC = 0;

        int expected = 0;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
    @Test
    public void testTimeToBurnExample_NoTree() {
        char[][] forest = {
            {'.','.','.','.'},
            {'.','.','.','.'},
            {'.','.','.','.'},
            {'.','.','.','.'}
        };

        int matchR = 0;
        int matchC = 0;

        int expected = 0;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
    
}
