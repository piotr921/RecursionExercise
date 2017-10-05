package recursion1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import recursion1.CountDigits;

import static org.testng.Assert.*;

public class CountDigitsTest {

    private CountDigits countDigits;

    @DataProvider
    public Object[][] provider7() {
        return new Object[][]{
                {67, 1},
                {1787, 2},
                {123, 0},
        };
    }

    @DataProvider
    public Object[][] provider8() {
        return new Object[][]{
                {8818, 4},
                {1787, 1},
                {123, 0},
        };
    }

    @DataProvider
    public Object[][] providerText() {
        return new Object[][]{
                {"xxhixx", 4},
                {"xhixhix", 3},
                {"hi", 0},
        };
    }

    @DataProvider
    public Object[][] providerHi() {
        return new Object[][]{
                {"xxhixx", 1},
                {"xhixhix", 2},
                {"hi", 1},
        };
    }

    @DataProvider
    public Object[][] providerHi2() {
        return new Object[][]{
                {"ahixhi", 1},
                {"ahibhi", 2},
                {"xhixhi", 0},
                {"hixhhi", 2},
        };
    }

    @BeforeMethod
    public void before(){
        countDigits = new CountDigits();
    }

    @Test(dataProvider = "provider7")
    public void testCount7(int number, int expectedResult) throws Exception {
        // When
        int result = countDigits.count7(number);

        // Then
        assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "provider8")
    public void testCount8(int number, int expectedResult) throws Exception {
        // When
        int result = countDigits.count8(number);

        // Then
        assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "providerText")
    public void testCountText(String text, int expectedResult) throws Exception {
        // When
        int result = countDigits.countX(text);

        // Then
        assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "providerHi")
    public void testCountHi(String text, int expectedResult) throws Exception {
        // When
        int result = countDigits.countHi(text);

        // Then
        assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "providerHi2")
    public void testCountHi2(String text, int expectedResult) throws Exception {
        // When
        int result = countDigits.countHi2(text);

        // Then
        assertEquals(result, expectedResult);
    }
}