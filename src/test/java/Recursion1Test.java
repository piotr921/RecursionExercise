import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Recursion1Test {

    private Recursion1 recursionObject;

    @DataProvider
    public Object[][] provider() {
        return new Object[][]{
                {1, 1},
                {2, 2},
                {3, 6},
        };
    }

    @BeforeMethod
    public void before() {
        recursionObject = new Recursion1();
    }

    @Test(dataProvider = "provider")
    public void testFactorial(int level, int expectedResult) throws Exception {
        // When
        int result = recursionObject.factorial(level);

        // Then
        assertEquals(result, expectedResult);
    }
}