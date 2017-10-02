import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Files;

import static org.testng.Assert.*;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @DataProvider
    public Object[][] provider() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {2, 1},
                {7, 13}
        };
    }

    @BeforeMethod
    public void before(){
        fibonacci = new Fibonacci();
    }

    @Test(dataProvider = "provider")
    public void testFibonacci(int n, int expectedResult) throws Exception {
        // When
        int result = fibonacci.fibonacci(n);

        // Then
        assertEquals(result, expectedResult);
    }
}