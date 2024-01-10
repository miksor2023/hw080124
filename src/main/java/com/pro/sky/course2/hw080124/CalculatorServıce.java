package com.pro.sky.course2.hw080124;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServıce {
    public int plus(int num1, int num2){
        return num1 + num2;
    }
    public int minus(int num1, int num2){
        return num1 - num2;
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    public double divide(int num1, int num2) throws DivisionByZeroException{
        if(num2 == 0){
            throw new DivisionByZeroException("ОШИБКА: Деление на ноль");
        }
        return (double) num1 / num2;
    }
}
