package src.tdd;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Array._0118;
import src.String._0014;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.testng.AssertJUnit.assertEquals;

public class _0118Test {

    private static _0118 solution;
    private static List<List<Integer>> expected;

    private int numRows;

    @BeforeClass
    public void setup() {
        solution = new _0118();
    }

    ;

    @Test
    public void test1() {
        numRows = 5;
        expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );
        assertEquals(expected, solution.generate(numRows));
    }

    @Test
    public void test2() {
        numRows = 1;
        expected = List.of(
                List.of(1)
        );
        assertEquals(expected, solution.generate(numRows));
    }
}

