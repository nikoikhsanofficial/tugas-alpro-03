import java.util.Scanner;

public class tugasbaru {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void hitungPenjumlahanFibonacci(int n) {
        System.out.print("Deret Fibonacci : ");
        int totalPenjumlahan = 0;

        for (int i = 0; i < n; i++) {
            int nilaiFib = fibonacci(i);
            System.out.print(nilaiFib);
            totalPenjumlahan += nilaiFib;

            if (i < n - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + totalPenjumlahan);
    }
}


    
