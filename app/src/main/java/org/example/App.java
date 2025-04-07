package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static class TriangleNumberCalculator {
        
        public int value(int n) {
            if (n <= 0) return 0; // Handle edge case
            if (n == 1) return 1;
            return n + value(n - 1);
        }

        public int add(int n, int m) {
            return value(n) + value(m);
        }

        public int subtract(int n, int m) {
            return value(n) - value(m);
        }

        // Add-Ons
        public int multiply(int n, int m) {
            return value(n) * value(m);
        }

        public double divide(int n, int m) {
            return (double) value(n) / value(m);
        }

        public List<Integer> sequence(int n) { // Changed to return List<Integer>
            List<Integer> result = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                result.add(value(i));
            }
            return result;
        }
    }

    public static void main(String[] args) {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        // Core Tests
        System.out.println(calculator.value(1)); // 1
        System.out.println(calculator.value(2)); // 3
        System.out.println(calculator.value(4)); // 10

        System.out.println(calculator.add(1, 1)); // 2
        System.out.println(calculator.add(2, 3)); // 9
        System.out.println(calculator.add(4, 2)); // 13

        System.out.println(calculator.subtract(1, 1)); // 0
        System.out.println(calculator.subtract(2, 3)); // -3
        System.out.println(calculator.subtract(4, 2)); // 7

        // Add-On Tests
        System.out.println(calculator.multiply(2, 3)); // 18
        System.out.println(calculator.divide(3, 2));   // 2.0
        System.out.println(calculator.sequence(5));    // [1, 3, 6, 10, 15]
    }
}
