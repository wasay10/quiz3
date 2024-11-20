import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DivisionTest {

    @Test
    void testDivision() {
        assertEquals(2, Division.division(10, 5), "10 / 5 should be 2");
        assertThrows(ArithmeticException.class, () -> Division.division(10, 0), "Division by zero should throw an exception");
    }

    @Test
    void testDivisionUsingLoop() {
        assertEquals(2, Division.divisionUsingLoop(10, 5), "10 / 5 using loop should be 2");
        assertEquals(-2, Division.divisionUsingLoop(-10, 5), "-10 / 5 using loop should be -2");
    }

    @Test
    void testDivisionUsingRecursion() {
        assertEquals(2, Division.divisionUsingRecursion(10, 5), "10 / 5 using recursion should be 2");
        assertEquals(0, Division.divisionUsingRecursion(1, 5), "1 / 5 using recursion should be 0");
    }

    @Test
    void testDivisionUsingMultiplication() {
        assertEquals(2, Division.divisionUsingMultiplication(10, 5), "10 / 5 using multiplication should be 2");
        assertEquals(0, Division.divisionUsingMultiplication(3, 5), "3 / 5 using multiplication should be 0");
    }

    @Test
    void testDivisionUsingShift() {
        assertEquals(2, Division.divisionUsingShift(10, 5), "10 / 5 using shift should be 2");
        assertEquals(0, Division.divisionUsingShift(3, 5), "3 / 5 using shift should be 0");
    }

    @Test
    void testDivisionUsingLogs() {
        assertEquals(2, Division.divisionUsingLogs(10, 5), "10 / 5 using logs should be 2");
        assertEquals(0, Division.divisionUsingLogs(3, 5), "3 / 5 using logs should be 0");
    }
}
