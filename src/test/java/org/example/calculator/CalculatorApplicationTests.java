package org.example.calculator;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorApplicationTests {
    private static CalculatorApplication calc;

    @BeforeClass
    public static void setup() {
        calc = new CalculatorApplication();
    }

    @Test
    public void testAdd() {
        assertEquals(10.5, calc.add(4.5, 6), 0.01);
    }

    @Test
    public void testSub() {
        assertEquals(-2, calc.sub(3, 5), 0.01);
    }

    @Test
    public void testMul() {
        assertEquals(36, calc.mul(6, 6), 0.01);
    }

    @Test
    public void testDiv() {
        assertEquals(2.5, calc.div(5, 2), 0.01);
    }


    @Test
    public void testSqRt() {
        assertEquals(6, calc.squareRoot(36), 0.01);
    }

    @Test
    public void testSqRtNegative() {
        assertTrue(Double.isNaN(calc.squareRoot(-36)));
    }

    @Test
    public void testSqRtZero() {
        assertEquals(0, calc.squareRoot(0), 0.01);
    }

    @Test
    public void testSqRtNonSquarePositive() {
        assertEquals(5.477, calc.squareRoot(30), 0.01);
    }
    @Test
    public void testSqRtSmallPositive() {
        assertEquals(0.1, calc.squareRoot(0.01), 0.01);
    }

    @Test
    public void testSqRtLargeNumber() {
        assertEquals(10000, calc.squareRoot(100000000), 0.01);
    }


    @Test
    public void testSqRtFraction() {
        assertEquals(0.7071, calc.squareRoot(0.5), 0.01);
    }



    @Test
    public void testPower() {
        assertEquals(8, calc.power(2, 3), 0.01);
    }

    @Test
    public void testPowerNegative() {
        assertEquals(0.027, calc.power(-6, -2), 0.01);
    }

    @Test
    public void testPowerZero() {
        assertEquals(1, calc.power(-8, 0), 0.01);
    }


    @Test
    public void testSin() {
        assertEquals(0.866, calc.sin(60), 0.01);
    }

    @Test
    public void testCos() {
        assertEquals(0.5, calc.cos(60), 0.01);
    }


    @Test
    public void testAbs() {
        assertEquals(5, calc.abs(-5), 0.01);
    }

    @Test
    public void testAddPower() {
        double result = calc.add((int) calc.power(2, 3), calc.sub(9, 2));
        assertEquals(15, result, 0.01);
    }


    @Test
    public void testSqRtPower() {
        assertEquals(100, calc.squareRoot(calc.power(100, 2)), 0.01);
    }

    @Test
    public void testPowerWithNegativeExponent() {
        assertEquals(0.25, calc.power(2, -2), 0.01);
    }

    @Test
    public void testPowerWithZeroExponent() {
        assertEquals(1, calc.power(5, 0), 0.01);
    }

    @Test
    public void testPowerOfZero() {
        assertEquals(0, calc.power(0, 5), 0.01);
    }

    @Test
    public void testNegativeBaseOddExponent() {
        assertEquals(-27, calc.power(-3, 3), 0.01);
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        double result = calc.add((int) calc.power(-2, 3), calc.sub(-9, -2));
        assertEquals(-15, result, 0.01);
    }

    @Test
    public void testSqrtOfOne() {
        assertEquals(1, calc.squareRoot(calc.power(1, 2)), 0.01);
    }

    @Test
    public void testSquareRootOfNegativeNumber() {
        assertTrue(Double.isNaN(calc.squareRoot(-4)));
    }

    @Test
    public void testLog() {
        assertEquals(0.25, calc.log(2, 16), 0.01);
    }


    @Test
    public void testLogBase2() {
        assertEquals(2, calc.log(4, 2), 0.01);
    }

    @Test
    public void testLogBase10() {
        assertEquals(2, calc.log(100, 10), 0.01);
    }

    @Test
    public void testLogSameBaseAndNumber() {
        assertEquals(1, calc.log(5, 5), 0.01);
    }

    @Test
    public void testLogOneAsNumber() {
        assertEquals(0, calc.log(1, 2), 0.01);
    }

    @Test
    public void testLogOneAsBase() {
        assertEquals(0, calc.log(2, 1), 0.01);
    }

    @Test
    public void testLogZeroAsNumber() {
        assertEquals(0, calc.log(0, 2), 0.01);
    }

    @Test
    public void testLogNegativeNumber() {
        assertEquals(0, calc.log(-2, 3), 0.01);
    }

    @Test
    public void testLogNegativeBase() {
        assertEquals(0, calc.log(3, -2), 0.01); // Handling negative base.
    }

    @Test
    public void testLogNegative() {
        assertEquals(0, calc.log(2, -16), 0.01);
    }


    @Test
    public void testFactorial() {
        assertEquals(24, calc.factorial(4), 0.01);
    }

    @Test
    public void testAbsFactorial() {
        assertEquals(2, calc.abs(calc.factorial(2)), 0.01);
    }

    @Test
    public void testFactorialAbs() {
        assertEquals(2, calc.factorial(calc.abs(-2)), 0.01);
    }


    @Test
    public void testFactorialZero() {
        assertEquals(1, calc.factorial(0), 0.01);
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, calc.factorial(1), 0.01);
    }

    @Test
    public void testFactorialFive() {
        assertEquals(120, calc.factorial(5), 0.01);
    }

    @Test
    public void testFactorialAbsNegative() {
        assertEquals(2, calc.factorial(calc.abs(-2)), 0.01);
    }

    @Test
    public void testFactorialAbsPositive() {
        assertEquals(6, calc.factorial(calc.abs(3)), 0.01);
    }

    @Test
    public void testFactorialLargeNumber() {
        assertEquals(1, calc.factorial(10), 0.01);
    }


}