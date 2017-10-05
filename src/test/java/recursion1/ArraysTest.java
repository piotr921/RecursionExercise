package recursion1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import recursion1.Arrays;

import static org.testng.Assert.*;

public class ArraysTest {

    private Arrays arrays;

    @DataProvider
    public Object[][] provider6() {
        return new Object[][]{
                {new int[]{1, 6, 4}, 0, true},
                {new int[]{1, 4}, 0, false},
        };
    }

    @DataProvider
    public Object[][] provider11() {
        return new Object[][]{
                {new int[]{1, 2, 11}, 0, 1},
                {new int[]{1, 4}, 0, 0},
                {new int[]{11, 14, 11}, 0, 2},
        };
    }

    @DataProvider
    public Object[][] provider220() {
        return new Object[][]{
                {new int[]{1, 2, 20}, 0, true},
                {new int[]{1, 4, 44}, 0, false},
                {new int[]{11, 14, 140}, 0, true},
                {new int[]{}, 0, false},
        };
    }

    @BeforeMethod
    public void before() {
        arrays = new Arrays();
    }

    @Test(dataProvider = "provider6")
    public void testArray6(int[] array, int beginIndex, boolean expected) throws Exception {
        // Given
        boolean result = arrays.array6(array, beginIndex);

        // Then
        assertEquals(result, expected);
    }

    @Test(dataProvider = "provider11")
    public void testArray11(int[] array, int beginIndex, int expected) throws Exception {
        // Given
        int result = arrays.array11(array, beginIndex);

        // Then
        assertEquals(result, expected);
    }

    @Test(dataProvider = "provider220")
    public void testArray220(int[] array, int beginIndex, boolean expected) throws Exception {
        // Given
        boolean result = arrays.array220(array, beginIndex);

        // Then
        assertEquals(result, expected);
    }

}