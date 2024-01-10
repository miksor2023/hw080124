package com.pro.sky.course2.hw080124;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.pro.sky.course2.hw080124.CalculatorServiseTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParametrizedTest {
    private CalculatorServıce out = new CalculatorServıce();
    public static Stream<Arguments> provideTestParamsForPlus(){
        return Stream.of(
                Arguments.of(FIRST_OPERAND, SECOND_OPERAND, PLUS_EXPECTED_RESULT_1),
                Arguments.of(THIRD_OPERAND, FOURTH_OPERAND, PLUS_EXPECTED_RESULT_2)
        );
    }
    public static Stream<Arguments> provideTestParamsForMinus(){
        return Stream.of(
                Arguments.of(FIRST_OPERAND, SECOND_OPERAND, MINUS_EXPECTED_RESULT_1),
                Arguments.of(THIRD_OPERAND, FOURTH_OPERAND, MINUS_EXPECTED_RESULT_2));
    }
    public static Stream<Arguments> provideTestParamsForMuliply(){
        return Stream.of(
                Arguments.of(FIRST_OPERAND, SECOND_OPERAND, MULYIPLY_EXPECTED_RESULT_1),
                Arguments.of(THIRD_OPERAND, FOURTH_OPERAND, MULYIPLY_EXPECTED_RESULT_2));
    }
    public static Stream<Arguments> provideTestParamsForDivide(){
        return Stream.of(
                Arguments.of(FIRST_OPERAND, SECOND_OPERAND, DIVIDE_EXPECTED_RESULT_1),
                Arguments.of(THIRD_OPERAND, FOURTH_OPERAND, DIVIDE_EXPECTED_RESULT_2));
    }
    @ParameterizedTest
    @MethodSource("provideTestParamsForPlus")
    public void shouldCalulateResultOfPlus (int num1, int num2, int expectedResult){
        int actualResult = out.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideTestParamsForMinus")
    public void shouldCalulateResultOfMınus (int num1, int num2, int expectedResult){
        int actualResult = out.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideTestParamsForMuliply")
    public void shouldCalulateResultOfMulıply (int num1, int num2, int expectedResult){
        int actualResult = out.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideTestParamsForDivide")
    public void shouldCalulateResultOfDıvıde (int num1, int num2, double expectedResult){
        double actualResult = out.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}
