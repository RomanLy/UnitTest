package task_3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidatorTest {
    @Test
    public void isTriangleExistPositiveTest() {
        assertTrue(Validator.isTriangleExist(10,10,10));
    }

    @Test
    public void isTriangleExistNegativeTest() {
        assertFalse(Validator.isTriangleExist(10,10,40));
    }
}