package recursion1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import recursion1.SumDigits;

import static org.testng.Assert.*;

public class SumDigitsTest {

    private SumDigits sumDigits;

    @DataProvider
    public Object[][] provider() {
        return new Object[][]{
                {126, 9},
                {49, 13},
                {12, 3},
                {10, 1},
        };
    }

    @BeforeMethod
    public void before(){
        sumDigits = new SumDigits();
    }

    @Test(dataProvider = "provider")
    public void testSumDigits(int n, int expectedResult) throws Exception {
        // When
        int result = sumDigits.sumDigits(n);

        // Then
        assertEquals(result, expectedResult);
    }

}