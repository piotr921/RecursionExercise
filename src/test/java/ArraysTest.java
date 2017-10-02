import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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

}