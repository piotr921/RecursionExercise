import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChangeXYTest {

    private ChangeXY changeXY;

    @DataProvider
    public Object[][] provider() {
        return new Object[][]{
                {"codex", "codey"},
                {"xxhixx", "yyhiyy"},
                {"xhixhix", "yhiyhiy"},
        };
    }

    @BeforeMethod
    public void before() {
        changeXY = new ChangeXY();
    }

    @Test(dataProvider = "provider")
    public void testCountHi(String text, String expectedResult) throws Exception {
        // When
        String result = changeXY.changeXY(text);

        // Then
        assertEquals(result, expectedResult);
    }

}