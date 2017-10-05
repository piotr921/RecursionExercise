import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PairsTest {

    private Pairs pairs;

    @DataProvider
    public Object[][] providerPairs() {
        return new Object[][]{
                {"AxAxA", 3},
                {"axa", 1},
                {"axbx", 1},
        };
    }

    @DataProvider
    public Object[][] providerAbc() {
        return new Object[][]{
                {"abc", 1},
                {"abcxxabc", 2},
                {"abaxxaba", 2},
        };
    }

    @DataProvider
    public Object[][] provider11() {
        return new Object[][]{
                {"abc", 0},
                {"a11b11c11", 3},
                {"111", 1},
        };
    }

    @BeforeMethod
    public void before() {
        pairs = new Pairs();
    }

    @Test(dataProvider = "providerPairs")
    public void testCountPairs(String text, int expected) throws Exception {
        // When
        int result = pairs.countPairs(text);

        // Then
        assertEquals(result, expected);
    }

    @Test(dataProvider = "providerAbc")
    public void testCountAbc(String text, int expected) throws Exception {
        // When
        int result = pairs.countAbc(text);

        // Then
        assertEquals(result, expected);
    }

    @Test(dataProvider = "provider11")
    public void testCount11(String text, int expected) throws Exception {
        // When
        int result = pairs.count11(text);

        // Then
        assertEquals(result, expected);
    }
}