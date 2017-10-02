import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CountDigitsTest {

    private CountDigits countDigits;

    @DataProvider
    public Object[][] provider() {
        return new Object[][]{
                {67, 1},
                {1787, 2},
                {123, 0},
        };
    }

    @BeforeMethod
    public void before(){
        countDigits = new CountDigits();
    }

    @Test(dataProvider = "provider")
    public void testCount7(int number, int expectedResult) throws Exception {
        // When
        int result = countDigits.count7(number);

        // Then
        assertEquals(result, expectedResult);
    }

}