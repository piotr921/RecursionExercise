package recursion1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import recursion1.SubStrings;

import static org.testng.Assert.*;

public class SubStringsTest {

    private SubStrings subStrings;

    @DataProvider
    public Object[][] providerStrCount() {
        return new Object[][]{
                {"catcowcat", "cat", 2},
                {"catcowcat", "cow", 1},
                {"catcowcat", "dog", 0},
        };
    }

    @DataProvider
    public Object[][] providerStrCopies() {
        return new Object[][]{
                {"catcowcat", "cat", 2, true},
                {"catcowcat", "cow", 1, true},
                {"catcowcat", "cow", 2, false},
                {"ijiiiiij", "iiii", 2, true}
        };
    }

    @DataProvider
    public Object[][] providerStrLength() {
        return new Object[][]{
                {"catcowcat", "cat", 9},
                {"catcowcat", "cow", 3},
                {"cccatcowcatxx", "cat", 9},
                {"xyx", "z",  0}
        };
    }

    @BeforeMethod
    public void before() {
        subStrings = new SubStrings();
    }

    @Test(dataProvider = "providerStrCount")
    public void strCountTest(String text, String word, int expected) {
        // When
        int result = subStrings.strCount(text, word);

        // Then
        assertEquals(result, expected);
    }

    @Test(dataProvider = "providerStrCopies")
    public void strCountCopies(String text, String word, int n, boolean expected) {
        // When
        boolean result = subStrings.strCopies(text, word, n);

        // Then
        assertEquals(result, expected);
    }

    @Test(dataProvider = "providerStrLength")
    public void strCountDist(String text, String word, int expected) {
        // When
        int result = subStrings.strDist(text, word);

        // Then
        assertEquals(result, expected);
    }
}