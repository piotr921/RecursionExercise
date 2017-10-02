import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BunnyEarsTest {

    private BunnyEars bunnyEars;

    @DataProvider
    public Object[][] provider() {
        return new Object[][]{
                {0, 0},
                {1, 2},
                {3, 6},
        };
    }

    @DataProvider
    public Object[][] provider2() {
        return new Object[][]{
                {0, 0},
                {1, 2},
                {2, 5},
        };
    }

    @BeforeMethod
    public void before() {
        bunnyEars = new BunnyEars();
    }

    @Test(dataProvider = "provider")
    public void testBunnyEars(int bunnies, int expectedResult) throws Exception {
        // When
        int result = bunnyEars.bunnyEars(bunnies);

        // Then
        assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "provider2")
    public void testBunnyEars2(int bunnies, int expectedResult) throws Exception {
        // When
        int result = bunnyEars.bunnyEars2(bunnies);

        // Then
        assertEquals(result, expectedResult);
    }
}