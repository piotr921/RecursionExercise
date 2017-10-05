package recursion1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import recursion1.Triangle;

import static org.testng.Assert.*;

public class TriangleTest {

    private Triangle triangle;

    @DataProvider
    public Object[][] provider() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {2, 3},
        };
    }

    @BeforeMethod
    public void before() {
        triangle = new Triangle();
    }

    @Test(dataProvider = "provider")
    public void testTriangle(int rows, int expectedResult) throws Exception {
        // When
        int result = triangle.triangle(rows);

        // Then
        assertEquals(result, expectedResult);
    }

}