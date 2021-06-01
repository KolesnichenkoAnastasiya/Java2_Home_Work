package com.company;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int x, int y) {
        System.out.println("Ошибка преобразования строкового массива в числовой, последняя преобразованная ячейка ["
                + (x+1) +"][" + (y+1) +"]");
        }
}


