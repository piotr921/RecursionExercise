import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PowerNTest {

    private PowerN powerN;

    @DataProvider
    public Object[][] provider() {
        return new Object[][]{
                {3, 1, 3},
                {3, 2, 9},
                {3, 3, 27},
        };
    }

    @BeforeMethod
    public void before() {
        powerN = new PowerN();
    }

    @Test(dataProvider = "provider")
    public void testPowerN(int base, int n, int expected) throws Exception {
        // When
        int result = powerN.powerN(base, n);

        // Then
        assertEquals(result, expected);
    }

}