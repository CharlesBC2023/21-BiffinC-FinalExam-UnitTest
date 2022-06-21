import  static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public final void negativeNumTest() {
        assertThrows(IndexOutOfBoundsException.class, () ->StringCalculator.add("1,-2"));

    }

    @Test
    public final void bigNumTest() {
        assertEquals(1, StringCalculator.add("1,1000"));

    }

}


