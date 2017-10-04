import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChangeTextTest {

    private ChangeText changeText;

    @DataProvider
    public Object[][] providerXY() {
        return new Object[][]{
                {"codex", "codey"},
                {"xxhixx", "yyhiyy"},
                {"xhixhix", "yhiyhiy"},
        };
    }

    @DataProvider
    public Object[][] providerPi() {
        return new Object[][]{
                {"xpix", "x3.14x"},
                {"pipi", "3.143.14"},
                {"pip", "3.14p"},
        };
    }

    @DataProvider
    public Object[][] providerNoX() {
        return new Object[][]{
                {"xaxb", "ab"},
                {"pipi", "pipi"},
                {"xx", ""},
        };
    }

    @DataProvider
    public Object[][] providerAllStar() {
        return new Object[][]{
                {"hello", "h*e*l*l*o"},
                {"abc", "a*b*c"},
                {"ab", "a*b"},
                {"", ""},
        };
    }

    @DataProvider
    public Object[][] providerPairStar() {
        return new Object[][]{
                {"hello", "hel*lo"},
                {"xxyy", "x*xy*y"},
                {"aaaa", "a*a*a*a"},
                {"", ""},
        };
    }

    @BeforeMethod
    public void before() {
        changeText = new ChangeText();
    }

    @Test(dataProvider = "providerXY")
    public void testChangeXY(String text, String expectedResult) throws Exception {
        // When
        String result = changeText.changeXY(text);

        // Then
        assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "providerPi")
    public void testChangePi(String text, String expectedResult) throws Exception {
        // When
        String result = changeText.changePi(text);

        // Then
        assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "providerNoX")
    public void testChangeNoX(String text, String expectedResult) throws Exception {
        // When
        String result = changeText.noX(text);

        // Then
        assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "providerAllStar")
    public void testAllStar(String text, String expectedResult) throws Exception {
        // When
        String result = changeText.allStar(text);

        // Then
        assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "providerPairStar")
    public void testPairStar(String text, String expectedResult) throws Exception {
        // When
        String result = changeText.pairStar(text);

        // Then
        assertEquals(result, expectedResult);
    }
}