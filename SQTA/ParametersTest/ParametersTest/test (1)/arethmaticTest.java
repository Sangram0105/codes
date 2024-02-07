
import calculator.Calculator;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class arethmaticTest {

    private int fno, sno, expresult;
    private Calculator calculator;

    public arethmaticTest(int fno, int sno, int expresult) {
        this.fno = fno;
        this.sno = sno;
        this.expresult = expresult;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{1, 2, 3}, {11, 22, 33}});
    }

    @Test
    public void testArthematic() {
        assertEquals(expresult, Calculator.add(fno, sno));
    }

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}

