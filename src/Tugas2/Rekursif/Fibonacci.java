package Tugas2.Rekursif;

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fibonacci(n));
    }
    private static int fibonacci (int n) {
        int fib1, fib2;
        fib1 = 0;
        fib2 = 1;
        int fib = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(fib2 + ",");
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }
}
