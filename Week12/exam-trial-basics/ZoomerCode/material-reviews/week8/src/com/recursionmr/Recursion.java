package com.recursionmr;

import java.nio.channels.FileChannel;

public class Main {

    public static void main(String[] args) {
    }

    public static Integer FactorialLoop(Integer num){
        var result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static Integer Factorial(Integer num){
        if(num <= 1){
            return 1;
        } else{
            return num * Factorial(num -1);
        }
    }

    public static Integer FactorialShort(Integer num){
        return num <= 1 ? 1 : num * Factorial(num-1);
    }

    public static Integer FibonacciLoop(Integer num){
        var current = 0;
        var last = 1;
        var penultimate = 0;

        for (int i = 2; i <= num; i++) {
            current = (penultimate + last);
            penultimate = last;
            last = current;
        }
        return current;
    }

    public static Integer Fibonacci(Integer num){
        System.out.println("Current value of num:" + num);
        if(num <= 1){
            return num;
        }else{
            return Fibonacci(num-1) + Fibonacci(num-2);
        }
    }

    public static Integer FibonacciShort(Integer num){
        return num <= 1 ? num : Integer.valueOf(Fibonacci(num - 1) + Fibonacci(num - 2));
    }
}
