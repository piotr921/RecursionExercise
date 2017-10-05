import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParenthesisTest {

    private Parenthesis parenthesis;

    @DataProvider
    public Object[][] provider() {
        return new Object[][]{
                {"xyz(abc)123", "(abc)"},
                {"x(hello)", "(hello)"},
                {"(xy)1", "(xy)"},
                {"()", "()"},
        };
    }

    @BeforeMethod
    public void before() {
        parenthesis = new Parenthesis();
    }

    @Test(dataProvider = "provider")
    public void testParenBit(String text, String expected) throws Exception {
        // When
        String result = parenthesis.parenBit(text);

        // Then
        assertEquals(result, expected);
    }

}