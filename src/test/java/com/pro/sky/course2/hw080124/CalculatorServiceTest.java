package com.pro.sky.course2.hw080124;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.pro.sky.course2.hw080124.CalculatorServiseTestConstants;

import static com.pro.sky.course2.hw080124.CalculatorServiseTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private CalculatorServıce out = new CalculatorServıce();

    @Test
    public void shouldCalulateResultOfPlus1(){
        int actualResult = out.plus(FIRST_OPERAND, SECOND_OPERAND);
        assertEquals(PLUS_EXPECTED_RESULT_1, actualResult);
    }
    @Test
    public void shouldCalculateResultOfPlus2(){
        int actualResult = out.plus(THIRD_OPERAND, FOURTH_OPERAND);
        assertEquals(PLUS_EXPECTED_RESULT_2, actualResult);
    }
    @Test
    public void shouldCalulateResultOfMinus1(){
        int actualResult = out.minus(FIRST_OPERAND, SECOND_OPERAND);
        assertEquals(MINUS_EXPECTED_RESULT_1, actualResult);
    }
    @Test
    public void shouldCalculateResultOfMinus2(){
        int actualResult = out.minus(THIRD_OPERAND, FOURTH_OPERAND);
        assertEquals(MINUS_EXPECTED_RESULT_2, actualResult);
    }
    @Test
    public void shouldCalulateResultOfMultiply1(){
        int actualResult = out.multiply(FIRST_OPERAND, SECOND_OPERAND);
        assertEquals(MULYIPLY_EXPECTED_RESULT_1, actualResult);
    }
    @Test
    public void shouldCalculateResultOfMultiply2(){
        int actualResult = out.multiply(THIRD_OPERAND, FOURTH_OPERAND);
        assertEquals(MULYIPLY_EXPECTED_RESULT_2, actualResult);
    }
    @Test
    public void shouldCalulateResultOfDivide1(){
        double actualResult = out.divide(FIRST_OPERAND, SECOND_OPERAND);
        assertEquals(DIVIDE_EXPECTED_RESULT_1, actualResult);
    }
    @Test
    public void shouldCalculateResultOfDivide2(){
        double actualResult = out.divide(THIRD_OPERAND, FOURTH_OPERAND);
        assertEquals(DIVIDE_EXPECTED_RESULT_2, actualResult);
    }
    @Test
    public void shouldThrowDivisionByZeroExceptionWhenDividerIsZero(){
        assertThrows(DivisionByZeroException.class, () -> out.divide(FIRST_OPERAND, ZERO));
    }


    
}
