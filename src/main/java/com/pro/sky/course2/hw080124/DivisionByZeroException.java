package com.pro.sky.course2.hw080124;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value = HttpStatus.BAD_REQUEST)
//если я ставлю аннотацию @ResponceStatus, в консоли не отображается информация
//об ошибке DivisionByZeroException: ОШИБКА: Деление на ноль
public class DivisionByZeroException extends IllegalArgumentException{
    public DivisionByZeroException(String s) {
        super(s);
    }

    public DivisionByZeroException() {
    }
}
