package com.dianaqa.exceptionservicetask;

public class ArithmeticOperationService {
    public static int divideDataWithoutTryAndCatch(int a, int b){
        return a/b;
        // in loc de double am pus int
    }

    public static int divideDataWithTryAndCatch(int a, int b){
        try {
            return a/b;
        } catch (RuntimeException exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            return 0;
        }
    }
}
