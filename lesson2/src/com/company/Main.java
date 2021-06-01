package com.company;

public class Main {

        public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] array = new String[][]{{"12", "23", "15", "55"}, {"52", "13", "55", "1"},
                        {"5", "8", "123", "155"}, {"97", "321", "8", "150"} };
        sumIntegerArray(array);

            String[][] array3 = new String[][]{{"12", "23", "15", "5k5"}, {"52", "13", "55", "1"},
                    {"5", "8", "123", "155"}, {"97", "321", "8", "150"} };
            sumIntegerArray(array3); /* Пример с недопустимым значением в массиве*/


            String[][] array2 = new String[][]{{"12", "23", "15", "55"}, {"52", "13", "55", "1"},
                    {"5", "8", "123", "155", "95"}, {"97", "321", "8", "150"} };
            sumIntegerArray(array2); /* Пример с выходом за границы массива*/
    }

    private static void sumIntegerArray(String[][] array) throws MyArraySizeException, MyArrayDataException  {
                int x = 0;
                int y = 0;
                int sum = 0;
                int[][] intArray = new int[4][4];
                if (array.length > 4) {
                    throw new MyArraySizeException();
                }
                try {
                    for (int i = 0; i < array.length; i++) {
                        if (array[i].length > 4) {
                            throw new MyArraySizeException();
                        }
                        for (int j = 0; j < array.length; j++) {
                            intArray[i][j] = Integer.parseInt(array[i][j]);
                            sum = sum + intArray[i][j];
                            x = i;
                            y = j;
                        }
                    }
                    System.out.println("Сумма всех элементов массива составляет: " + sum);
                }
            catch (ArrayIndexOutOfBoundsException e) {
                throw new MyArraySizeException();
            }
            catch (NumberFormatException e){
                  throw new MyArrayDataException(x,y);
               }
            }
}
