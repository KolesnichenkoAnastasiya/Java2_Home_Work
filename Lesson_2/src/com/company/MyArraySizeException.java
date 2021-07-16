package com.company;

public class MyArraySizeException extends RuntimeException {
        public MyArraySizeException() {
        super("Не корректно заданный массив. Выход за пределы массива [4][4]");
        }
}
