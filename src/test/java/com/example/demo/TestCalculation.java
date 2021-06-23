package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculation {

    private CalculationController calculator;

    @BeforeEach
    public void setUp() throws Exception {
        calculator = new CalculationController();
    }

    @Test
    public void testAddition(){
        assertEquals(20, calculator.addition(15,5));
    }

    @Test
    public void testSubtraction(){
        assertEquals(15, calculator.subtraction(20,5));
    }

    @Test
    public void testMultiplication(){
        assertEquals(20, calculator.multiplication(4,5));
    }

    @Test
    public void testDivision(){
        assertEquals(4, calculator.division(20,5));
    }
}
