import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result); // Пример теста
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        int result = calculator.dif(10, 4);
        assertEquals(6, result); // Пример теста
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        int result = calculator.div(20, 5);
        assertEquals(4, result); // Пример теста
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        int result = calculator.times(6, 7);
        assertEquals(42, result); // Пример теста
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        int result = calculator.solver();
        assertEquals(6, result); // Пример теста
    }
}
