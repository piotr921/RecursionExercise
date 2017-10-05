package recursion2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraysTest {

    private Arrays arrays;

    @DataProvider
    public Object[][] providerSum() {
        return new Object[][]{
                {0, new int[]{2, 4, 8}, 10, true},
                {0, new int[]{2, 4, 8}, 14, true},
                {0, new int[]{2, 4, 8}, 9, false},
        };
    }

    @BeforeMethod
    public void before() {
        arrays = new Arrays();
    }

    @Test(dataProvider = "providerSum")
    public void testGroupSum(int start, int[] nums, int check, boolean expected) throws Exception {
        // Given
        boolean result = arrays.groupSum(start, nums, check);

        // Then
        assertEquals(expected, result);
    }

}