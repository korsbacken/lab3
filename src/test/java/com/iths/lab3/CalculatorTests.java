package com.iths.lab3;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTests {
    Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Adding two positive numbers")
    void additionOfTwoPositiveNumbers(){
        int result = calculator.add(5,5);
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("Adding one positive number with one negative number")
    void additionWithOneNegativeNumber(){
        int result = calculator.add(4,-4);
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("Subtracting two positive numbers")
    void subtractionWithTwoPositiveNumbers(){
        int result = calculator.subtract(9,4);
        Assertions.assertEquals(5, result);
    }

    @Test
    @DisplayName("Subtracting two negative numbers")
    void subtractionWithTwoNegativeNumbers(){
        int result = calculator.subtract(-6,-4);
        Assertions.assertEquals(-2, result);
    }

    @Test
    @DisplayName("Multiplying two positive numbers")
    void multiplicationPositiveNumbers(){
        int result = calculator.multiply(7,7);
        Assertions.assertEquals(49, result);
    }

    @Test
    @DisplayName("Multiplying two negative numbers")
    void multiplicationNegativeNumbers(){
        int result = calculator.multiply(-7,-5);
        Assertions.assertEquals(35, result);
    }

    @Test
    @DisplayName("Multiplying a factor by 0")
    void multiplyingByZero(){
        int result = calculator.multiply(7,0);
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("Dividing two positive numbers")
    void divisionPositiveNumbers(){
        double result = calculator.divide(5,4);
        Assertions.assertEquals(1.25, result);
    }

    @Test
    @DisplayName("Dividing two negative numbers")
    void divisionNegativeNumbers(){
        double result = calculator.divide(-9,-4);
        Assertions.assertEquals(2.25, result);
    }

    @Test
    @DisplayName("Square root of a positive number")
    void squareRootPositiveNumber(){
        double result = calculator.squareRootOf(81);
        Assertions.assertEquals(9, result);
    }

    @Test
    @DisplayName("Square root of zero")
    void squareRootOfZero(){
        double result = calculator.squareRootOf(0);
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("Calculating area of circle with a positive radius")
    void circleAreaPositiveRadius(){
        double result = calculator.getArea(8);
        Assertions.assertEquals(201.06, result);
    }

    @Test
    @DisplayName("Calculating area of circle with 0 radius")
    void circleAreaZeroRadius(){
        double result = calculator.getArea(0);
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("Calculating area of circle with negative radius")
    void circleAreaNegativeRadius(){
        double result = calculator.getArea(-16);
        Assertions.assertTrue(Double.isNaN(result));
    }

    @Test
    @DisplayName("Calculating circumference of circle with a positive radius")
    void circumferencePositiveRadius(){
        double result = calculator.getCircumference(5);
        Assertions.assertEquals(31.42, result);
    }

    @Test
    @DisplayName("Calculating circumference of circle with 0 radius")
    void circumferenceRadiusZero(){
        double result = calculator.getCircumference(0);
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("Calculating circumference of circle with negative radius")
    void circumferenceNegativeRadius(){
        double result = calculator.getCircumference(-13);
        Assertions.assertTrue(Double.isNaN(result));
    }
}
