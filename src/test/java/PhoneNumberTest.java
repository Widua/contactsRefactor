import models.PhoneNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PhoneNumberTest {
    private final PhoneNumber number = new PhoneNumber() ;

    @Test
    @DisplayName("eu numbers")
    void testPolishNumbers(){
        number.setNumber("555666888");
        assertTrue(number.isValid());

        number.setNumber("+49555666777");
        assertTrue(number.isValid());

        number.setNumber("555 666 888");
        assertTrue(number.isValid());

        number.setNumber("+49 555 666 777");
        assertTrue(number.isValid());

        number.setNumber("+49 555666777");
        assertTrue(number.isValid());

    }

    @Test
    @DisplayName("non correct numbers")
    void testnoncorrectNumbers(){
        number.setNumber("5");
        assertFalse(number.isValid());

        number.setNumber("+55 5");
        assertFalse(number.isValid());

        number.setNumber("+55");
        assertFalse(number.isValid());

        number.setNumber("22");
        assertFalse(number.isValid());
    }
}
