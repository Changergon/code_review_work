import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        double result = calculator.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        double result = calculator.dif(10, 4);
        assertEquals(6, result);
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        double result = calculator.div(20, 5);
        assertEquals(4, result);
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        double result = calculator.times(6, 7);
        assertEquals(42, result);
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        double result = calculator.solver();
        assertEquals(11.5, result);
    }
}
