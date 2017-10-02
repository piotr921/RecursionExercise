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

}