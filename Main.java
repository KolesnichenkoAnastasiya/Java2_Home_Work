package com.company;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] array = new String[][]{{"12", "23", "15", "55"}, {"52", "13", "55", "1"},
                {"5", "8", "123", "155"}, {"97", "321", "8", "150"}};
        System.out.println("Sum: " + sumIntegerArray(array));

        String[][] array3 = new String[][]{{"12", "23", "15", "5k5"}, {"52", "13", "55", "1"},
                {"5", "8", "123", "155"}, {"97", "321", "8", "150"}};
//        sumIntegerArray(array3); /* Пример с недопустимым значением в массиве*/


        String[][] array2 = new String[][]{{"12", "23", "15", "55"}, {"52", "13", "55", "1"},
                {"5", "8", "123", "155", "95"}, {"97", "321", "8", "150"}};
//        sumIntegerArray(array2); /* Пример с выходом за границы массива*/
    }

    private static int sumIntegerArray(String[][] array) {
        checkSize(array);
        checkContent(array);

        int sum = 0;
        for (String[] subArr : array) {
            for (String s : subArr) {
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }

    private static void checkContent(String[][] arr) {
        int i = 0;
        int j = 0;
        try {
            for (i=0; i < arr.length; i++) {
                for (j=0; j < arr[i].length; j++) {
                    Integer.parseInt(arr[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            String message = String.format("Error. Cannot convert string value to number. Values[%s], [%s]", i, j);
            throw new MyArrayDataException(message);
        }
    }

    private static void checkSize(Object[][] arr) {
        if (arr.length != 4) {
            throw new MyArraySizeException("Incorrectly specified array. Out of bounds of array [4] [4]");
        }
        for (Object[] subArr : arr) {
            if (subArr.length != 4) {
                throw new MyArraySizeException("Incorrectly specified array. Out of bounds of array [4] [4]");
            }
        }
    }
}
