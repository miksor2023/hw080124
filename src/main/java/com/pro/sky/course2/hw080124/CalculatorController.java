package com.pro.sky.course2.hw080124;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class CalculatorController {
    private CalculatorServıce calculatorServıce;

    public CalculatorController(CalculatorServıce calculatorServıce) {
        this.calculatorServıce = calculatorServıce;
    }

    @GetMapping
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String sumUp(Integer num1, Integer num2){
        if(num1 == null || num2 == null) {
            return "ОШИБКА: Параметр отсутствует";
        }
        return num1 + " + " + num2 + " = " + calculatorServıce.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String subtract(Integer num1, Integer num2){
        if(num1 == null || num2 == null) {
            return "ОШИБКА: Параметр отсутствует";
        }
        return num1 + " - " + num2 + " = " + calculatorServıce.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(Integer num1, Integer num2){
        if(num1 == null || num2 == null) {
            return "ОШИБКА: Параметр отсутствует";
        }
        return num1 + " * " + num2 + " = " + calculatorServıce.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(Integer num1, Integer num2){
        if(num1 == null || num2 == null) {
            return "ОШИБКА: Параметр отсутствует";
        }
        if(num2 == 0){
            throw new DivisionByZeroException("ОШИБКА: Деление на ноль");
        }
        return num1 + " / " + num2 + " = " + calculatorServıce.divide(num1, num2);
    }
}
