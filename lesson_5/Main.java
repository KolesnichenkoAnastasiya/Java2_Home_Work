package com.company;

import java.util.Arrays;

public class Main {

    static final int SIZE = 10000000;
    final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];

    public static void main(String[] args) {
        new Main().firstMethod();
//        new Main().secondMethod();
    }
    void firstMethod() {
        Arrays.fill(arr, 1.0f);
        long startTimeFirst =System.currentTimeMillis();
        doCalculation(arr);
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTimeFirst) + " ms.");
    }
    void secondMethod (){
        Arrays.fill(arr, 1.0f);
        long startTimeSecond = System.currentTimeMillis();
        float [] arrHalf1 = new float[HALF];
        float [] arrHalf2 = new float[HALF];
        System.arraycopy(arr, 0, arrHalf1, 0,  HALF);
        System.arraycopy(arr, HALF, arrHalf2, 0,  HALF);
        Thread t1 = new Thread(() -> doCalculation(arrHalf1));
        Thread t2 = new Thread(() -> doCalculation(arrHalf2));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(arrHalf1, 0, arr, 0, HALF);
        System.arraycopy(arrHalf2, 0, arr, HALF, HALF);
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTimeSecond) + " ms.");
    }
    void doCalculation (float[] arr){
        for (int i=0; i<arr.length; i++) {
            arr[i]=(float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}


