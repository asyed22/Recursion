package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class TriangleNumberCalculatorTest {

    @Test
    void testValue() {
        App.TriangleNumberCalculator calculator = new App.TriangleNumberCalculator();
        
        assertEquals(1, calculator.value(1));  // T1 = 1
        assertEquals(3, calculator.value(2));  // T2 = 3
        assertEquals(10, calculator.value(4)); // T4 = 10
        assertEquals(0, calculator.value(0));  // Edge case for n <= 0
    }

    @Test
    void testAdd() {
        App.TriangleNumberCalculator calculator = new App.TriangleNumberCalculator();

        assertEquals(2, calculator.add(1, 1));   // T1 + T1 = 1 + 1 = 2
        assertEquals(9, calculator.add(2, 3));   // T2 + T3 = 3 + 6 = 9
        assertEquals(13, calculator.add(4, 2));  // T4 + T2 = 10 + 3 = 13
    }

    @Test
    void testSubtract() {
        App.TriangleNumberCalculator calculator = new App.TriangleNumberCalculator();

        assertEquals(0, calculator.subtract(1, 1));   // T1 - T1 = 1 - 1 = 0
        assertEquals(-3, calculator.subtract(2, 3));  // T2 - T3 = 3 - 6 = -3
        assertEquals(7, calculator.subtract(4, 2));   // T4 - T2 = 10 - 3 = 7
    }

    @Test
    void testMultiply() {
        App.TriangleNumberCalculator calculator = new App.TriangleNumberCalculator();

        assertEquals(18, calculator.multiply(2, 3));  // T2 * T3 = 3 * 6 = 18
    }

    @Test
    void testDivide() {
        App.TriangleNumberCalculator calculator = new App.TriangleNumberCalculator();

        assertEquals(2.0, calculator.divide(3, 2));    // T3 / T2 = 6 / 3 = 2.0
    }

    @Test
    void testSequence() {
        App.TriangleNumberCalculator calculator = new App.TriangleNumberCalculator();

        List<Integer> expectedSequence = List.of(1, 3, 6, 10, 15);
        assertEquals(expectedSequence, calculator.sequence(5)); // Sequence up to T5
    }
}
